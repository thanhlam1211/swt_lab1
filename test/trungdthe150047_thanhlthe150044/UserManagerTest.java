/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trungdthe150047_thanhlthe150044;

import common.AppConstant;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.User;
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

    @Test
    public void testGetListAccounts() {
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
                if (userInfo[3].trim().equals("Admin")) { // sửa
                    user.setType(1);
                } else {
                    user.setType(2);
                }
                userList.add(user); // đã add được các object từ file sang array list
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

    @Test(timeout = 100)
    public void testCheckLogin() {
        String userNameTest = "trungdt";
        String passWordTest = "Vietnam";
        int check = 0;
        User user = new User();
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
            System.out.println("Loi o buffer reader");
            System.out.println(ex);
        }

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
    }

    @Test
    public void testUpdateUser() {
    }

    @Test
    public void testDeleteUser() {
    }

}
