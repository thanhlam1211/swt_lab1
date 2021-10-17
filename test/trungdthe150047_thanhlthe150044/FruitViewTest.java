/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trungdthe150047_thanhlthe150044;

import java.util.ArrayList;
import model.Fruit;
import view.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DO THANH TRUNG
 */
public class FruitViewTest {
    FruitView fv;
    
    public FruitViewTest() {
        fv = new FruitView();
    }

    @Test
    public void testManageFruits() {
    }

    @Test (timeout = 100)
    public void testDisplayListFruit() {
        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit(1, "lemon", 2, 100, "Vietnam"));
        fruitList.add(new Fruit(2, "Avocado", 5, 100, "Vietnam"));
        fruitList.add(new Fruit(3, "Banana", 4, 100, "Vietnam"));
        fruitList.add(new Fruit(4, "Grape", 9, 100, "Vietnam"));
        fruitList.add(new Fruit(5, "Papaya", 9, 100, "Vietnam"));
        fruitList.add(new Fruit(6, "apple", 3, 100, "Vietnam"));
        int list_count = 6;
        assertEquals(list_count, fruitList.size());
        fail("The test case is a prototype.");
    }
    
}
