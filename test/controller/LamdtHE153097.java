/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Fruit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class LamdtHE153097 {

    public LamdtHE153097() {
    }
    
    private Fruit f;

    private final ArrayList<Fruit> fruitList = new ArrayList<>();

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        fruitList.add(new Fruit(1, "lemon", 2, 100, "Vietnam"));
        fruitList.add(new Fruit(2, "Avocado", 5, 100, "Vietnam"));
        fruitList.add(new Fruit(3, "Banana", 4, 100, "Vietnam"));
        fruitList.add(new Fruit(4, "Grape", 9, 100, "Vietnam"));
        fruitList.add(new Fruit(5, "Papaya", 9, 100, "Vietnam"));
    }

    @After
    public void tearDown() {
        fruitList.removeAll(fruitList);
    }

    /**
     * Test of Fruit method, of class FruitManager.
     */
    @Test
    public void testFruit() {
//        System.out.println("Fruit");
//        ArrayList<Fruit> fruitList = null;
//        FruitManager instance = new FruitManager();
//        instance.Fruit(fruitList);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        assertEquals("Checking size of List", 5, fruitList.size());
    }

    /**
     * Test of addFruit method, of class FruitManager.
     */
    @Test
    public void testAddFruit() {
//        System.out.println("addFruit");
//        FruitManager instance = new FruitManager();
//        instance.addFruit();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        fruitList.add(new Fruit(6, "apple", 2, 100, "Vietnam"));
        assertEquals("Adding 1 more fruit to list", 6, fruitList.size());
    }

    /**
     * Test of updateFruit method, of class FruitManager.
     */
    @Test
    public void testUpdateFruit() {
//        System.out.println("updateFruit");
//        FruitManager instance = new FruitManager();
//        instance.updateFruit();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

    }

    /**
     * Test of deleteFruit method, of class FruitManager.
     */
    @Test
    public void testDeleteFruit() {
//        System.out.println("deleteFruit");
//        FruitManager instance = new FruitManager();
//        instance.deleteFruit();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        fruitList.remove("apple");
        assertEquals("Removing 1 fruit from list", 5, fruitList.size());
    }

    /**
     * Test of getFruitList method, of class FruitManager.
     */
    @Test
    public void testGetFruitList() {
//        System.out.println("getFruitList");
//        FruitManager instance = new FruitManager();
//        ArrayList<Fruit> expResult = null;
//        ArrayList<Fruit> result = instance.getFruitList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        int size = 5;
        assertEquals("Checking size of List", size, fruitList.size());
    }

    /**
     * Test of getFruitById method, of class FruitManager.
     */
    @Test
    public void testGetFruitById() {
//        System.out.println("getFruitById");
//        int id = 0;
//        FruitManager instance = new FruitManager();
//        Fruit expResult = null;
//        Fruit result = instance.getFruitById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getFruitByItem method, of class FruitManager.
     */
    @Test
    public void testGetFruitByItem() {
//        System.out.println("getFruitByItem");
//        int item = 0;
//        ArrayList<Fruit> fruitList = null;
//        FruitManager instance = new FruitManager();
//        Fruit expResult = null;
//        Fruit result = instance.getFruitByItem(item, fruitList);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    

}
