/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LamdtHE153097;

import common.DataInput;
import java.util.ArrayList;
import model.Fruit;
import model.Order;
import model.User;
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
public class TESTCASE1 {

    public TESTCASE1() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of checkInputIntLimit method, of class DataInput.
     */
    @Test
    public void testCheckInputIntLimit_3args() {
//        System.out.println("checkInputIntLimit");
//        String msg = "";
//        int min = 0;
//        int max = 0;
//        int expResult = 0;
//        int result = DataInput.checkInputIntLimit(msg, min, max);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPassword method, of class DataInput.
     */
    @Test
    public void testCheckPassword() {
//        System.out.println("checkPassword");
//        String msg = "";
//        String expResult = "";
//        String result = DataInput.checkPassword(msg);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkInputUserName method, of class DataInput.
     */
    @Test
    public void testCheckInputUserName() {
//        System.out.println("checkInputUserName");
//        String msg = "";
//        String expResult = "";
//        String result = DataInput.checkInputUserName(msg);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkInputPassword method, of class DataInput.
     */
    @Test
    public void testCheckInputPassword() {
//        System.out.println("checkInputPassword");
//        String msg = "";
//        String expResult = "";
//        String result = DataInput.checkInputPassword(msg);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkInputIntLimit method, of class DataInput.
     */
    @Test
    public void testCheckInputIntLimit_int_int() {
//        System.out.println("checkInputIntLimit");
//        int min = 0;
//        int max = 0;
//        int expResult = 0;
//        int result = DataInput.checkInputIntLimit(min, max);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkInputString method, of class DataInput.
     */
    @Test
    public void testCheckInputString() {
//        System.out.println("checkInputString");
//        String smg = "";
//        String expResult = "";
//        String result = DataInput.checkInputString(smg);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkInputInt method, of class DataInput.
     */
    @Test
    public void testCheckInputInt() {
//        System.out.println("checkInputInt");
//        String smg = "";
//        int expResult = 0;
//        int result = DataInput.checkInputInt(smg);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkInputDouble method, of class DataInput.
     */
    @Test
    public void testCheckInputDouble() {
//        System.out.println("checkInputDouble");
//        String smg = "";
//        double expResult = 0.0;
//        double result = DataInput.checkInputDouble(smg);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkInputYN method, of class DataInput.
     */
    @Test
    public void testCheckInputYN() {
//        System.out.println("checkInputYN");
//        boolean expResult = false;
//        boolean result = DataInput.checkInputYN();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of fruitExisted method, of class DataInput.
     */
    @Test
    public void testFruitExisted() {
//        System.out.println("fruitExisted");
//        ArrayList<Fruit> lf = null;
//        int id = 0;
//        boolean expResult = false;
//        boolean result = DataInput.fruitExisted(lf, id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit(1, "lemon", 2, 100, "Vietnam"));
        fruitList.add(new Fruit(2, "Avocado", 5, 100, "Vietnam"));
        fruitList.add(new Fruit(3, "Banana", 4, 100, "Vietnam"));
        fruitList.add(new Fruit(4, "Grape", 9, 100, "Vietnam"));
        fruitList.add(new Fruit(5, "Papaya", 9, 100, "Vietnam"));
        
        int id;
        boolean expResult;
        boolean result;
                
        //TC1:
        id=1;
        expResult = true;
        result = DataInput.fruitExisted(fruitList, id);
        assertEquals("TC1", expResult, result);
        
        //TC2:
        id=2;
        expResult = true;
        result = DataInput.fruitExisted(fruitList, id);
        assertEquals("TC2", expResult, result);
        
        //TC3:
        id=3;
        expResult = true;
        result = DataInput.fruitExisted(fruitList, id);
        assertEquals("TC3", expResult, result);
        
        //TC4:
        id=4;
        expResult = true;
        result = DataInput.fruitExisted(fruitList, id);
        assertEquals("TC4", expResult, result);
        
        //TC5:
        id=5;
        expResult = true;
        result = DataInput.fruitExisted(fruitList, id);
        assertEquals("TC5", expResult, result);
        
        //TC6:
        id=6;
        expResult = false;
        result = DataInput.fruitExisted(fruitList, id);
        assertEquals("TC6", expResult, result);
        
    }

    /**
     * Test of userExisted method, of class DataInput.
     */
    @Test
    public void testUserExisted() {
//        System.out.println("userExisted");
//        ArrayList<User> userList = null;
//        int userCode = 0;
//        boolean expResult = false;
//        boolean result = DataInput.userExisted(userList, userCode);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkItemExist method, of class DataInput.
     */
    @Test
    public void testCheckItemExist() {
//        System.out.println("checkItemExist");
//        ArrayList<Order> lo = null;
//        int id = 0;
//        boolean expResult = false;
//        boolean result = DataInput.checkItemExist(lo, id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}

