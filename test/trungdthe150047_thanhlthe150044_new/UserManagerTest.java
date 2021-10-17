/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trungdthe150047_thanhlthe150044_new;

import common.AppConstant;
import common.DataInput;
import controller.UserManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.User;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DO THANH TRUNG
 */
public class UserManagerTest {

    public UserManagerTest() {
    }

    private static UserManager testUserManager;

    @Test
    public void testGetListAccounts() {

        //code demo cũ
        int count = 0;
        ArrayList<User> userList = new ArrayList<>();
        File f = new File(AppConstant.USER_DATA);
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                count++;
                User user = new User();
                String[] userInfo = line.split("\\|");
                user.setUserId(Integer.parseInt(userInfo[0].trim()));
                user.setUserName(userInfo[1].trim());
                user.setPassword(userInfo[2].trim());
                if (userInfo[3].trim().equals("Admin")) {
                    user.setType(1);
                } else {
                    user.setType(2);
                }
                //đã add được các object từ file sang arraylist
                userList.add(user);
            }
            reader.close();
        } catch (Exception ignored) {
        }
        int expectedResult = 4;

        ArrayList<User> userListExpected = new ArrayList<>();
        User user1 = new User(1, "trungdt", "Vietnam", 1);
        User user2 = new User(2, "thanhlt", "Tuan134", 2);
        User user3 = new User(3, "lambt", "14France", 2);
        User user4 = new User(4, "kiennt", "Vietnam", 1);

        userListExpected.add(0, user1);
        userListExpected.add(1, user2);
        userListExpected.add(2, user3);
        userListExpected.add(3, user4);

        assertEquals(expectedResult, count);
        for (int i = 0; i < 4; i++) {
            Assert.assertEquals(userListExpected.get(i), userList.get(i));
        }
    }

    @Test
    public void testCheckAccounts() {
        ArrayList<User> listUsers = new ArrayList<>();
        User user1 = new User(1, "trungdt", "Vietnam", 1);
        User user2 = new User(2, "thanhlt", "thanh1234", 2);
        User user3 = new User(3, "lambt", "thanhlam", 2);
        User user4 = new User(4, "lamdt", "Vietnam", 1);
        User user5 = new User(5, "kien", "kien123", 1);
        listUsers.add(0, user1);
        listUsers.add(1, user2);
        listUsers.add(2, user3);
        listUsers.add(3, user4);
        listUsers.add(4, user5);

        testUserManager = new UserManager();

        //TC1 : (user name true, pass true)
        boolean result = testUserManager.checkLogin(user1);
        boolean expectedResult = true;
        assertEquals(expectedResult, result);

        //TC2 : (user name true, pass true)
        boolean result1 = testUserManager.checkLogin(user2);
        boolean expectedResult1 = true;
        assertEquals(expectedResult1, result1);

        //TC3 : (user name true, pass true)
        boolean result2 = testUserManager.checkLogin(user3);
        boolean expectedResult2 = true;
        assertEquals(expectedResult2, result2);

        //TC4 : (user name true, pass true)
        boolean result3 = testUserManager.checkLogin(user4);
        boolean expectedResult3 = true;
        assertEquals(expectedResult3, result3);

        //TC5 : (user name true, pass true)
        boolean result4 = testUserManager.checkLogin(user5);
        boolean expectedResult4 = true;
        assertEquals(expectedResult4, result4);
    }

    @Test(timeout = 100)
    public void testCheckLogin() {

        //code demo cũ
//        String filename = "user.dat";
//        User user = new User(1, "trungdt", "Vietnam", 1);
//        boolean expectResult = true;
//        boolean result = UserManager.checkLogin(filename, user);
//        assertEquals(expectResult, result);
        String userNameTest = "trungdt";
        String passWordTest = "Vietnam";
        int check = 0;
        File f = new File(AppConstant.USER_DATA);
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split("\\|");
                if (userNameTest.equals(userInfo[1].trim()) && passWordTest.equals((userInfo[2].trim()))) {
                    check = 1;
                }
            }
        } catch (IOException ex) {
            System.out.println("Error");
            System.out.println(ex);
        }

        //TC1 : check login account trungdt
        Assert.assertEquals(1, check);
    }

    @Test
    public void testChangePassword() {
    }

    @Test
    public void testSaveAccount() {
    }

    @Test
    public void testGetUserList() {
    }

    @Test
    public void testAddUser() {
        ArrayList<User> listUsers = new ArrayList<>();
        User user1 = new User(1, "trungdt", "Vietnam", 1);
        User user2 = new User(2, "thanhlt", "thanh1234", 2);
        User user3 = new User(3, "lambt", "thanhlam", 2);
        User user4 = new User(4, "lamdt", "Vietnam", 1);

        listUsers.add(0, user1);
        listUsers.add(1, user2);
        listUsers.add(2, user3);
        listUsers.add(3, user4);

        boolean flag = true;
        String userName = "trungdt1";
        if (DataInput.checkNameDuplicate(listUsers, userName)) {
            flag = false;
            System.err.println("username existed!");
            return;
        }

        String password = "Vietnam1";
        int userType = 1;
        User user = new User(5, userName, password, userType);

        //TC1 : Check account trùng nhau
        listUsers.add(user);
        assertEquals(true, flag);

        //TC2 : Check add account
        int expectedResult = 5;
        assertEquals(expectedResult, listUsers.size());

        //TC3 : Check account mới nhất
        assertEquals(userName, listUsers.get(4).getUserName());
    }

    @Test
    public void testUpdateUser() {
    }

    //expected exception
    @Test
    public void testDeleteUser() throws Exception {
        ArrayList<User> userListExpected = new ArrayList<>();
        try {
            if (userListExpected.isEmpty()) {
                for (int i = 0; i < userListExpected.size(); i++) {
                    userListExpected.remove(i);
                }
            }
            fail("Not throw exception");
        } catch (Exception e) {
            assertThat(e, instanceOf(IllegalStateException.class));
            assertEquals(e.getMessage(), "list empty");
        }
    }

}
