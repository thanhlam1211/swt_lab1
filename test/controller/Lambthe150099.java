/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
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
//Testing for UserManager class
public class Lambthe150099 {
    private static UserManager testUserManager;
    
    public Lambthe150099() {
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
     * Test of checkLogin method, of class UserManager.
     */
    @Test
    public void testCheckLogin() {
        ArrayList<User> listUsers = new ArrayList<>();
        User user1 = new User(1, "lam", "1211", 1);
        User user2 = new User(2, "quang", "123", 3);
        User user3 = new User(3, "thanh", "123", 4);
        User user4 = new User(4, "kien", "abcd", 1);
        
        listUsers.add(0, user1);
        listUsers.add(1, user2);
        listUsers.add(2, user3);
        listUsers.add(3, user4);
     
        testUserManager = new UserManager();
        
        //TC1 : Username, passworld correct
        boolean check = testUserManager.checkLogin(user1);
        boolean expectedResult = true;
        assertEquals("TC1", expectedResult, check);
        
        //TC2 : Username, passworld wrong
        boolean check2 = testUserManager.checkLogin(user2);
        boolean expectedResult2 = false;
        assertEquals("TC2", expectedResult2, check2);
        
         //TC3 : Username true, passworld wrong
        boolean check3 = testUserManager.checkLogin(user3);
        boolean expectedResult3 = false;
        assertEquals("TC3", expectedResult3, check3);
        
         //TC4 : Username wrong, passworld true
        boolean check4 = testUserManager.checkLogin(user4);
        boolean expectedResult4 = false;
        assertEquals("TC4", expectedResult4, check4);
    }

    /**
     * Test of changePassword method, of class UserManager.
     */
    @Test
    public void testChangePassword() {
        ArrayList<User> listUsers = new ArrayList<>();
        User user1 = new User(1, "lam", "1211", 1);
        User user2 = new User(2, "quang", "123", 3);
        User user3 = new User(3, "thanh", "123", 4);
        User user4 = new User(4, "kien", "abcd", 1);
        
        listUsers.add(0, user1);
        listUsers.add(1, user2);
        listUsers.add(2, user3);
        listUsers.add(3, user4);
     
        testUserManager = new UserManager();
        
        //TC1: Wrong username
        boolean check = testUserManager.changePassword(user4, "1211");
        boolean expectedResult = false;
        assertEquals("TC1", expectedResult, check);
        
        //TC2 : Username, passworld correct
        boolean check2 = testUserManager.changePassword(user2,"123");
        boolean expectedResult2 = true;
        assertEquals("TC2", expectedResult2, check2);
        
        //TC2 : Username correct, passworld wrong
        boolean check3 = testUserManager.changePassword(user3,"1234");
        boolean expectedResult3 = false;
        assertEquals("TC2", expectedResult3, check3);
    }

    
}
