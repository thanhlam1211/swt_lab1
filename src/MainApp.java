
import view.FruitView;
import view.OrderView;

import controller.*;
import common.*;
import java.util.ArrayList;
import model.Fruit;
import model.Order;
import model.User;
import view.UserView;

public class MainApp {

    static ArrayList<Order> lo = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<Fruit> fruitList = new ArrayList<>();
        FruitManager fm = new FruitManager();
        //in ra list fruit 
        //Đỗ Thành Trung - Lê Trung Thành

        fm.Fruit(fruitList);

        while (true) {
            System.out.println("FRUIT SHOP SYSTEM");
            System.out.println("  1.Shopping");
            System.out.println("  2.Login");
            System.out.println("  3.Exit");
            switch (DataInput.checkInputIntLimit(AppConstant.ENTER_CHOICE, 1, 3)) {
                case 1:
                    goShopping(fruitList);
                    break;
                case 2:
                    UserView userView = new UserView();
                    User user = userView.login();
                    if (user.getType() == 1) {
                        handleAdminMenu(user, fruitList);
                    } else {
                        handleSaleMenu(user, fruitList);
                    }
                    break;
                default:
                    return;
            }
        }
    }

    //sửa lại goShopping(), sửa phần YN sau khi shopping, ...
    //Đỗ Thành Trung - Lê Trung Thành
    private static void goShopping(ArrayList<Fruit> listFruit) {
        FruitManager fm = new FruitManager();
        FruitView fv = new FruitView();
        OrderManager om = new OrderManager();
        OrderView ov = new OrderView();

        while (true) {

            fv.displayListFruit(listFruit);
            System.out.print("Enter item: ");
            int item = DataInput.checkInputIntLimit(1, listFruit.size());
            System.out.print("Enter quantity: ");
            int quantity = DataInput.checkInputIntLimit(1, fm.getFruitByItem(item, listFruit).getQuantity());
            om.shopping(listFruit, fm.getFruitByItem(item, listFruit), quantity);
            ov.displayListOrder(om.getListOrder());
            String name = DataInput.checkInputString("Enter name: ");
            om.putToHashTable(name);
            System.out.println("Add successfull");

            lo.add(new Order(fm.getFruitByItem(item, listFruit).getFruitId() + "", fm.getFruitByItem(item, listFruit).getFruitName(),
                    quantity, fm.getFruitByItem(item, listFruit).getPrice()));
            if (!DataInput.checkInputYN()) {
                break;
            }
        }
    }

    private static void handleAdminMenu(User user, ArrayList<Fruit> fruitList) {
        while (true) {
            System.out.println("FRUIT SHOP SYSTEM");
            System.out.println("  1.Manage users");
            System.out.println("  2.Manage fruits");
            System.out.println("  3.View orders");
            System.out.println("  4.Shopping");
            System.out.println("  5.Logout");
            switch (DataInput.checkInputIntLimit(AppConstant.ENTER_CHOICE, 1, 5)) {
                case 1:
                    UserView.manageUsers();
                    break;
                case 2:
                    FruitView.manageFruits();
                    break;
                case 3:
                    viewOrders();
                case 4:
                    goShopping(fruitList);
                default:
                    return;
            }
        }
    }

    private static void viewOrders() {
        OrderManager orderManager = new OrderManager();
        OrderView orderView = new OrderView();
        orderView.viewOrder(orderManager.getHashTable());
    }

    private static void handleSaleMenu(User user, ArrayList<Fruit> fruitList) {
        {
            while (true) {
                System.out.println("FRUIT SHOP SYSTEM");
                System.out.println("  1.Manage fruits");
                System.out.println("  2.View orders");
                System.out.println("  3.Shopping");
                System.out.println("  4.Logout");
                switch (DataInput.checkInputIntLimit(AppConstant.ENTER_CHOICE, 1, 4)) {
                    case 1:
                        FruitView.manageFruits();
                        break;
                    case 2:
                        viewOrders();
                    case 3:
                        goShopping(fruitList);
                    default:
                        return;
                }
            }
        }
    }
}
