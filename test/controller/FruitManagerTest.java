/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.DataInput;
import java.util.ArrayList;
import model.Fruit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import controller.FruitManager;

/**
 *
 * @author Kien
 */
public class FruitManagerTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of Fruit method, of class FruitManager.
     */
    @Test (timeout = 100)
    public void testFruit() {
        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit(1, "lemon", 2, 100, "Vietnam"));
        fruitList.add(new Fruit(2, "Avocado", 5, 100, "Vietnam"));
        fruitList.add(new Fruit(3, "Banana", 4, 100, "Vietnam"));
        fruitList.add(new Fruit(4, "Grape", 9, 100, "Vietnam"));
        fruitList.add(new Fruit(5, "Papaya", 9, 100, "Vietnam"));
        int count = 5;
        assertEquals(count, fruitList.size());
    }

    /**
     * Test of addFruit method, of class FruitManager.
     */
    @Test (timeout = 100)
    public void testAddFruit() {
        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit(1, "lemon", 2, 100, "Vietnam"));
        fruitList.add(new Fruit(2, "Avocado", 5, 100, "Vietnam"));
        fruitList.add(new Fruit(3, "Banana", 4, 100, "Vietnam"));
        fruitList.add(new Fruit(4, "Grape", 9, 100, "Vietnam"));
        fruitList.add(new Fruit(5, "Papaya", 9, 100, "Vietnam"));
        
        ArrayList<Fruit> expected = new ArrayList<>();
        fruitList.add(new Fruit(1, "lemon", 2, 100, "Vietnam"));
        fruitList.add(new Fruit(2, "Avocado", 5, 100, "Vietnam"));
        fruitList.add(new Fruit(3, "Banana", 4, 100, "Vietnam"));
        fruitList.add(new Fruit(4, "Grape", 9, 100, "Vietnam"));
        fruitList.add(new Fruit(5, "Papaya", 9, 100, "Vietnam"));
        fruitList.add(new Fruit(6, "Apple", 9, 100, "Vietnam"));
        for (int i = 0; i < fruitList.size(); i++) {
            assertEquals(fruitList.get(i).getFruitId(), expected.get(i).getFruitId());
        }
    }
//
//    /**
//     * Test of updateFruit method, of class FruitManager.
//     */
//    @Test
//    public void testUpdateFruit() {
//        System.out.println("updateFruit");
//        FruitManager instance = new FruitManager();
//        instance.updateFruit();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteFruit method, of class FruitManager.
//     */
//    @Test
//    public void testDeleteFruit() {
//        System.out.println("deleteFruit");
//        FruitManager instance = new FruitManager();
//        instance.deleteFruit();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFruitList method, of class FruitManager.
//     */
//    @Test
//    public void testGetFruitList() {
//        System.out.println("getFruitList");
//        FruitManager instance = new FruitManager();
//        ArrayList<Fruit> expResult = null;
//        ArrayList<Fruit> result = instance.getFruitList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFruitById method, of class FruitManager.
//     */
    @Test
    public void testGetFruitById() {
        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit(1, "lemon", 2, 100, "Vietnam"));
        fruitList.add(new Fruit(2, "Avocado", 5, 100, "Vietnam"));
        fruitList.add(new Fruit(3, "Banana", 4, 100, "Vietnam"));
        fruitList.add(new Fruit(4, "Grape", 9, 100, "Vietnam"));
        fruitList.add(new Fruit(5, "Papaya", 9, 100, "Vietnam"));
        Fruit result = null;
        for (Fruit fruit : fruitList) {
            if (fruit.getFruitId() == 1) {
                result = fruit;
            }
        }
        Fruit expected = new Fruit(1, "lemon", 2, 100, "Vietnam");
        assertEquals(expected, result);
    }
//
//    /**
//     * Test of getFruitByItem method, of class FruitManager.
//     */
//    @Test
//    public void testGetFruitByItem() {
//        System.out.println("getFruitByItem");
//        int item = 0;
//        ArrayList<Fruit> fruitList = null;
//        FruitManager instance = new FruitManager();
//        Fruit expResult = null;
//        Fruit result = instance.getFruitByItem(item, fruitList);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
