/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LamdtHE153097;
import common.DataInput;
import controller.UserManager;
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
public class TESTCASE2 {
    
    public TESTCASE2() {
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
     * Test of getListAccounts method, of class UserManager.
     */
    @Test
    public void testGetListAccounts() {
//        System.out.println("getListAccounts");
//        List<String> expResult = null;
//        List<String> result = UserManager.getListAccounts();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkLogin method, of class UserManager.
     */
    @Test
    public void testCheckLogin() {
//        System.out.println("checkLogin");
//        String filename = "";
//        User user = null;
//        boolean expResult = false;
//        boolean result = UserManager.checkLogin(filename, user);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of changePassword method, of class UserManager.
     */
    @Test
    public void testChangePassword() {
//        System.out.println("changePassword");
//        User user = null;
//        String newPassword = "";
//        UserManager.changePassword(user, newPassword);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAccount method, of class UserManager.
     */
    @Test
    public void testSaveAccount() {
//        System.out.println("saveAccount");
//        List<String> listUsers = null;
//        UserManager.saveAccount(listUsers);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserList method, of class UserManager.
     */
    @Test
    public void testGetUserList() {
//        System.out.println("getUserList");
//        UserManager instance = new UserManager();
//        ArrayList<User> expResult = null;
//        ArrayList<User> result = instance.getUserList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UserManager.
     */
    @Test
    public void testAddUser() {
//        System.out.println("addUser");
//        UserManager instance = new UserManager();
//        instance.addUser();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserManager.
     */
    @Test
    public void testUpdateUser() {
//        System.out.println("updateUser");
//        UserManager instance = new UserManager();
//        instance.updateUser();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserManager.
     */
    @Test
    public void testDeleteUser() {
//        System.out.println("deleteUser");
//        UserManager instance = new UserManager();
//        instance.deleteUser();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        ArrayList<User> listUsers = new ArrayList<>();
        User user1 = new User(1, "trungdt", "Vietnam", 1);
        User user2 = new User(2, "thanhlt", "thanh1234", 2);
        User user3 = new User(3, "lambt", "thanhlam", 2);
        User user4 = new User(4, "lamdt", "Vietnam", 1);
                listUsers.add(0, user1);
                
        //TC1:
        boolean flag = false;
        int testUserId = 4;
        if (!DataInput.userExisted(listUsers, testUserId)) {
            flag = true;
            System.out.println("UserId does not existed!");
            return;
        }
        assertEquals(true, flag);
        
        //TC2: Xóa một phần tử
        testUserId=1;
        for (int i = 0; i < listUsers.size(); i++) {
            if (testUserId == listUsers.get(i).getUserId()) {
                listUsers.remove(i);
                break;
            }
        }
        int expected3 = 1;
        int listSize = listUsers.size();
        assertEquals(expected3, listSize);

        
    }
    
}

