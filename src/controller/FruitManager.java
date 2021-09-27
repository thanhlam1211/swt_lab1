package controller;

import common.DataInput;
import java.util.ArrayList;
import java.util.Scanner;
import model.Fruit;

public class FruitManager {

    private final ArrayList<Fruit> fruitList = new ArrayList<>();

//    public static boolean isIDDuplicated(ArrayList<Fruit> listFruit, String id) {
//        for (Fruit check : listFruit) {
//            if(id.equalsIgnoreCase(check.getFruitId())) {
//                return true;
//            }
//        }
//        return false;
//    }
//    
//    public static String inputID(ArrayList<Fruit> list) {
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            String id = sc.nextLine().trim();
//            if (id.isEmpty()) {
//                System.out.print("Can not empty.\nEnter again: ");
//            } else if (isIDDuplicated(list, id)) {
//                System.out.print("ID duplicated.\nEnter again: ");
//            } else {
//                return id;
//            }
//        }
//    }
//******************************************************************************    
    /*
    KHỞI TẠO MỘT DANH DÁCH CÁC FRUIT BAN ĐẦU
    
    public FruitManager() {
    fruitList.add(new Fruit("SP1", "APPLE", 1000, 2, "VN"));
    fruitList.add(new Fruit("SP2", "BANANA", 500, 5, "US"));
    fruitList.add(new Fruit("SP3", "ORANGE", 2000, 10, "kOREA"));
}
     */
    public void addFruit() {
        //loop until user don't want to create fruit
        while (true) {
            String fruitId = DataInput.checkInputString("Enter fruit id: ");
            if (DataInput.fruitExisted(fruitList, fruitId)) {
                System.err.println("Id exist");
                return;
            }

            /*
            Commentator: LAMDTHE153097
            
            THÊM CÁC CÂU LỆNH PRINT:
             */
            System.out.print("Enter fruit name: ");
            String fruitName = DataInput.checkInputString("Enter fruit name: ");
            System.out.print("Enter price: ");
            double price = DataInput.checkInputDouble("Enter price: ");
            System.out.print("Enter quantity: ");
            int quantity = DataInput.checkInputInt("Enter quantity: ");
            System.out.print("Enter origin: ");
            String origin = DataInput.checkInputString("Enter origin: ");
            fruitList.add(new Fruit(fruitId, fruitName, price, quantity, origin));
            //check user want to continue or not
            if (!DataInput.checkInputYN()) {
                return;
            }
        }
    }

    public void updateFruit() {
        //loop until user don't want to create fruit
//        while (true) {
//            String fruitId = DataInput.checkInputString("Enter fruit id: ");
//            if (!DataInput.fruitExisted(fruitList, fruitId)) {
//                System.err.println("Id does not exist!");
//                return;
//            }
//            String fruitName = DataInput.checkInputString("Enter fruit name: ");
//            double price = DataInput.checkInputDouble("Enter price: ");
//            int quantity = DataInput.checkInputInt("Enter quantity: ");
//            String origin = DataInput.checkInputString("Enter origin: ");
//            fruitList.add(new Fruit(fruitId, fruitName, price, quantity, origin));
//        }
        while (true) {
            String fruitId = DataInput.checkInputString("Enter fruit id: ");
            if (DataInput.fruitExisted(fruitList, fruitId)) {
                System.err.println("Id exist");
                return;
            }

            /*
            Commentator: LAMDTHE153097
            
            THÊM CÁC CÂU LỆNH PRINT:
             */
            Fruit f = getFruitById(fruitId);
            System.out.println("Do you want to change fruit name? ");
            if (DataInput.checkInputYN()) {
                System.out.print("Enter fruit name: ");
                String name = DataInput.checkInputString("Enter fruit name: ");
                f.setFruitName(name);
            }
            System.out.println("Do you want to change fruit price? ");
            if (DataInput.checkInputYN()) {
                System.out.print("Enter price: ");
                int price = DataInput.checkInputInt("Enter fruit price: ");
                f.setPrice(price);
            }
            System.out.println("Do you want to change fruit quantity? ");
            if (DataInput.checkInputYN()) {
                System.out.print("Enter quantity: ");
                int quantity = DataInput.checkInputInt("Enter fruit quantity: ");
                f.setQuantity(quantity);
            }
            System.out.println("Do you want to change fruit origin? ");
            if (DataInput.checkInputYN()) {
                System.out.print("Enter origin: ");
                String origin = DataInput.checkInputString("Enter fruit origin: ");
                f.setOrigin(origin);
            }
        }
    }

    public void deleteFruit() {
        while (true) {
            String fruitId = DataInput.checkInputString("Enter fruit id: ");
            if (!DataInput.fruitExisted(fruitList, fruitId)) {
                System.err.println("Id does not exist!");
                return;
            }
            /*
            Commentator: LAMDTHE153097
            
            THÊM HÀNH ĐỘNG XÓA FRUIT:
            
            else{
                fruitList.remove(fruitId);
            }
             */
        }
    }

    public ArrayList<Fruit> getFruitList() {
        return fruitList;
    }

    public Fruit getFruitById(String id) {
        for (Fruit fruit : fruitList) {
            if (fruit.getFruitId().equalsIgnoreCase(id)) {
                return fruit;
            }
        }
        return null;
    }

    //get fruint user want to by
    public Fruit getFruitByItem(int item) {
        int countItem = 1;
        for (Fruit fruit : fruitList) {
            //check shop have item or not 
            if (fruit.getQuantity() != 0) {
                countItem++;
            }
            if (countItem - 1 == item) {
                return fruit;
            }
        }
        return null;
    }
}
