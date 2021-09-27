/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.DataInput;
import model.Fruit;
import model.Order;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author VLT
 */
public class OrderManager {

    private Hashtable<String, ArrayList<Order>> customerList = new Hashtable<>();
    //Thay tên biến từ "lo" thành "listOrder" => tránh gây khó hiểu khi người ngoài đọc code
    //chuyển lúc gọi hàm checkInputYN() trong function goShopping()
    //Đỗ Thành Trung - Lê Trung Thành
    ArrayList<Order> listOrder = new ArrayList<>();

    public void shopping(ArrayList<Fruit> lf, Fruit fruit, int quantity) {
        //check list empty user can't buy
        if (lf.isEmpty()) {
            System.err.println("No have item.");
            return;
        }
        //loop until user don't want to buy continue
//        while (true) {
        fruit.setQuantity(fruit.getQuantity() - quantity);
        //check item exist or not
        if (!DataInput.checkItemExist(listOrder, fruit.getFruitId())) {
            updateOrder(listOrder, fruit.getFruitId(), quantity);
        } else {
            listOrder.add(new Order(fruit.getFruitId() + "", fruit.getFruitName(),
                    quantity, fruit.getPrice()));
        }
//            if (!DataInput.checkInputYN()) {
//                break;
//            }
//        }
    }

    //Thay tên hàm từ "putToHT" thành "putToHashTable" => tránh gây khó hiểu khi người ngoài đọc code
    //Đỗ Thành Trung - Lê Trung Thành
    public void putToHashTable(String name) {//update ten khach hang voi list order cua khach hang
        customerList.put(name, listOrder);
    }

    //Thay tên hàm từ "getHT" thành "getHashTable" => tránh gây khó hiểu khi người ngoài đọc code
    //Đỗ Thành Trung - Lê Trung Thành
    public Hashtable<String, ArrayList<Order>> getHashTable() {
        return customerList;
    }

    public ArrayList<Order> getListOrder() {
        return listOrder;
    }

    public void updateOrder(ArrayList<Order> lo, int id, int quantity) {
        for (Order order : lo) {
            if (order.getFruitId().equalsIgnoreCase(id + "")) {
                order.setQuantity(order.getQuantity() + quantity);
                return;
            }
        }
    }
}
