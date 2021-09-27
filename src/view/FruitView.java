/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import common.AppConstant;
import common.DataInput;
import controller.FruitManager;
import model.Fruit;
import java.util.ArrayList;

public class FruitView {

    public static void manageFruits() {
        FruitManager userManager = new FruitManager();
        while (true) {
            System.out.println("FRUITS MANAGEMENT");
            System.out.println("  1.Add new fruit");
            System.out.println("  2.Edit/update a fruit");
            System.out.println("  3.Delete a fruit");
            System.out.println("  4.Main screen");

            switch (DataInput.checkInputIntLimit(AppConstant.ENTER_CHOICE, 1, 4)) {
                case 1:
                    userManager.addFruit();
                    break;
                case 2:
                    userManager.updateFruit();
                    break;
                case 3:
                    userManager.deleteFruit();
                    break;
                default:
                    return;
            }
        }
    }

    public void displayListFruit(ArrayList<Fruit> fruitList) {
        int countItem = 1;
        System.out.printf("%-10s%-20s%-20s%10s\n", "Item", "Fruit name", "Origin", "Price");
        for (Fruit fruit : fruitList) {
            //check shop have item or not 
            if (fruit.getQuantity() != 0) {
                System.out.printf("%-10d%-20s%-20s%10.0f$\n", countItem++,
                        fruit.getFruitName(), fruit.getOrigin(), fruit.getPrice());
            }
        }
    }

}
