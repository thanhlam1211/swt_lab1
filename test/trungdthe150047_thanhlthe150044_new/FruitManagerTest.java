/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trungdthe150047_thanhlthe150044_new;

import common.DataInput;
import controller.FruitManager;
import java.util.ArrayList;
import model.Fruit;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DO THANH TRUNG
 */
public class FruitManagerTest {

    FruitManager fm;

    public FruitManagerTest() {
        fm = new FruitManager();
    }

    @Test
    public void testFruit() {

    }

    @Test
    public void testAddFruit() {
        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit(1, "Pineapple ", 20, 100, "Vietnam"));
        fruitList.add(new Fruit(2, "Kiwi ", 17, 100, "Vietnam"));
        fruitList.add(new Fruit(3, "Durian ", 42, 100, "Vietnam"));
        fruitList.add(new Fruit(4, "Apple ", 91, 100, "Vietnam"));
        fruitList.add(new Fruit(5, "Cherry ", 19, 100, "Vietnam"));
        fruitList.add(new Fruit(6, "Peach ", 7, 100, "Vietnam"));
        fruitList.add(new Fruit(7, "Strawberry  ", 23, 100, "Vietnam"));
        //code test demo cũ
//        int list_count = 7;
//        assertEquals(list_count, fruitList.size());

        //TC1 : Kiểm tra số lượng của fruitList 
        int expected = 7;
        assertEquals(expected, fruitList.size());
        //TC2 : Kiểm tra fruit cuối cùng trong list
        String expected1 = "Strawberry";
        String result = fruitList.get(fruitList.size() - 1).getFruitName();
        assertEquals(expected1, result);
        //TC3 : Kiểm tra xuất xứ của fruit cuối cùng trong list
        String expected2 = "Vietnam";
        String result1 = fruitList.get(fruitList.size() - 1).getOrigin();
        assertEquals(expected2, result1);
    }

    @Test
    public void testUpdateFruit() {

    }

    @Test
    public void testDeleteFruit() {
        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit(1, "Pineapple ", 20, 100, "Vietnam"));
        fruitList.add(new Fruit(2, "Kiwi ", 17, 100, "Vietnam"));
        fruitList.add(new Fruit(3, "Durian ", 42, 100, "Vietnam"));
        fruitList.add(new Fruit(4, "Apple ", 91, 100, "Vietnam"));
        fruitList.add(new Fruit(5, "Cherry ", 19, 100, "Vietnam"));
        fruitList.add(new Fruit(6, "Peach ", 7, 100, "Vietnam"));
        fruitList.add(new Fruit(7, "Strawberry  ", 23, 100, "Vietnam"));

        //code test demo cũ
//        for (int i = 0; i < fruitList.size(); i++) {
//            fruitList.remove(fruitList.get(i).getFruitId());
//            assertEquals("Removing 1 fruit from list", 2, fruitList.size());
//        }

        //TC1: Kiểm tra nếu FruitId not found trong list
        boolean flag = false;
        int testFruitId = 7;
        if (!DataInput.fruitExisted(fruitList, testFruitId)) {
            flag = true;
            System.out.println("FruitId does not existed!");
            return;
        }
        assertEquals(true, flag);

        //TC2: Xóa 1 phần tử trong fruitList
        testFruitId = 1;
        for (int i = 0; i < fruitList.size(); i++) {
            if (testFruitId == fruitList.get(i).getFruitId()) {
                fruitList.remove(i);
                break;
            }
        }
        int expected3 = 1;
        int listSize = fruitList.size();
        assertEquals(expected3, listSize);
    }

    @Test
    public void testGetFruitList() {
        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit(1, "Pineapple ", 20, 100, "Vietnam"));
        fruitList.add(new Fruit(2, "Kiwi ", 17, 100, "Vietnam"));
        fruitList.add(new Fruit(3, "Durian ", 42, 100, "Vietnam"));
        fruitList.add(new Fruit(4, "Apple ", 91, 100, "Vietnam"));
        fruitList.add(new Fruit(5, "Cherry ", 19, 100, "Vietnam"));
        fruitList.add(new Fruit(6, "Peach ", 7, 100, "Vietnam"));
        fruitList.add(new Fruit(7, "Strawberry  ", 23, 100, "Vietnam"));

        //TC1 : Kiểm tra số lượng của fruitList 
        int list_count = 6;
        assertEquals(list_count, fruitList.size());
    }

    @Test
    public void testGetFruitById() {
        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit(1, "Pineapple ", 20, 100, "Vietnam"));
        fruitList.add(new Fruit(2, "Kiwi ", 17, 100, "Vietnam"));
        fruitList.add(new Fruit(3, "Durian ", 42, 100, "Vietnam"));
        fruitList.add(new Fruit(4, "Apple ", 91, 100, "Vietnam"));
        fruitList.add(new Fruit(5, "Cherry ", 19, 100, "Vietnam"));
        fruitList.add(new Fruit(6, "Peach ", 7, 100, "Vietnam"));
        fruitList.add(new Fruit(7, "Strawberry  ", 23, 100, "Vietnam"));
        
        //TC1 : Kiểm tra get fruit by FruitId
        Fruit result = null;
        for (Fruit f : fruitList) {
            if (f.getFruitId() == 7) {
                result = f;
            }
        }
        Fruit expected = new Fruit(7, "Strawberry  ", 23, 100, "Vietnam");
        assertEquals(expected, result);
    }

    @Test
    public void testGetFruitByItem() {
    }

}
