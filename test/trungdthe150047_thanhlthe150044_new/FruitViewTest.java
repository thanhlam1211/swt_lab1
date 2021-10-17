/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trungdthe150047_thanhlthe150044_new;

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
        fruitList.add(new Fruit(1, "Pineapple ", 20, 100, "Vietnam"));
        fruitList.add(new Fruit(2, "Kiwi ", 17, 100, "Vietnam"));
        fruitList.add(new Fruit(3, "Durian ", 42, 100, "Vietnam"));
        fruitList.add(new Fruit(4, "Apple ", 91, 100, "Vietnam"));
        fruitList.add(new Fruit(5, "Cherry ", 19, 100, "Vietnam"));
        fruitList.add(new Fruit(6, "Peach ", 7, 100, "Vietnam"));
        fruitList.add(new Fruit(7, "Strawberry  ", 23, 100, "Vietnam"));
        int list_count = 7;
        assertEquals(list_count, fruitList.size());
    }
    
}
