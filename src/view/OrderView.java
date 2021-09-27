/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Fruit;
import model.Order;
import java.util.ArrayList;
import java.util.Hashtable;

public class OrderView {
    
// Commentator: Trung Kiên

    public static void displayListOrder(ArrayList<Order> lo) {
        if (lo.isEmpty()) {
             System.out.println("No order available!");
        }
        double total = 0;
        System.out.printf("%15s%15s%15s%15s\n", "Product", "Quantity", "Price", "Amount");
        for (Order order : lo) {
            System.out.printf("%15s%15f%15.0f$%15.0f$\n", order.getFruitName(), //Quantity co the la double
                    order.getQuantity(), order.getPrice(),
                    order.getPrice() * order.getQuantity());
            total += order.getPrice() * order.getQuantity();
        }
        System.out.println("Total: " + total + "$");
    }
    //allow user show view order
    
    // Commentator: Trung Kiên

    public static void viewOrder(Hashtable<String, ArrayList<Order>> ht) {
        if (ht.isEmpty()) {                                     //Check neu list empty thi k in ra
            System.out.println("No order available!");
        }
        for (String name : ht.keySet()) {
            System.out.println("Customer: " + name);    //Khong nen de customer name lam key cho hashtable
            ArrayList<Order> lo = ht.get(name);
            displayListOrder(lo);
        }
//        for (int id : ht.keySet()) {
//            System.out.println("Customer ID: " + id);    
//            ArrayList<Order> lo = ht.get(id);
//            displayListOrder(lo);
//        }
    }
}
