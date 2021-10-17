/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.AppConstant;
import common.DataInput;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author kiennt
 */
public class UserManager {

    private static final ArrayList<User> userList = new ArrayList<>();

    public static List<String> getListAccounts() {
        List<String> listUsers = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(AppConstant.USER_DATA), StandardCharsets.UTF_8));) {
            listUsers = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                listUsers.add(line);
            }
        } catch (Exception ex) {
        }
        return listUsers;
    }

    public static boolean checkLogin(User user) {
        File f = new File(AppConstant.USER_DATA);
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split("\\|");
                if (user.getUserName().equals(userInfo[1].trim()) && user.getPassword().equals((userInfo[2].trim()))) {
                    user.setType(Integer.parseInt(userInfo[3].trim()));
                    user.setUserId(Integer.parseInt(userInfo[0].trim()));
                    return true;
                }
            }
        } catch (IOException ex) {
        }

        return false;
    }

    //lambthe150099
    public static boolean changePassword(User user, String newPassword) {
        List<String> listUsers = getListAccounts();
        if (listUsers != null && !listUsers.isEmpty()) {
            for (int i = 0; i < listUsers.size(); i++) {
                String[] userInfo = listUsers.get(i).split("\\|");
                if (user.getUserId() == Integer.parseInt(userInfo[0])) {
                    listUsers.set(i, userInfo[0] + "|" + userInfo[1] + "|" + newPassword + "|" + userInfo[3]);
                    user.setPassword(newPassword);
                    return true;
                }
            }
            saveAccount(listUsers);
        }
        return false;
    }

    public static void saveAccount(List<String> listUsers) {
        try (FileOutputStream fos = new FileOutputStream(new File(AppConstant.USER_DATA))) {
            for (String user : listUsers) {
                fos.write(user.getBytes());
                fos.write("\n".getBytes());
            }
        } catch (IOException ex) {
        }
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    //lambthe150099
    public void addUser() {
        //loop until user don't want to create fruit
        int id = 1;
        while (true) {
            if (!userList.isEmpty()) {
                id = userList.get(userList.size() - 1).getUserId() + 1;
            }
            String userName = DataInput.checkInputUserName("Enter user name: ");
            for (User user : userList) {
                if (user.getUserName().equalsIgnoreCase(userName)) {
                    System.out.println("User name must unique!");
                    return;
                }
            }
            String password = DataInput.checkInputPassword("Enter password: ");
            int userType = DataInput.checkInputInt("Enter user type: ");
            userList.add(new User(id, userName, password, userType));
            //check user want to continue or not
            if (!DataInput.checkInputYN()) {
                return;
            }
        }
    }

    //lambthe150099
    public void updateUser() {
        //loop until user don't want to create fruit
        while (true) {
            int userCode = DataInput.checkInputInt("Enter user code: ");
            if (!DataInput.userExisted(userList, userCode)) {
                System.err.println("User code does not exist!");
                return;
            }

            String userName = DataInput.checkInputUserName("Enter user name: ");
            String password = DataInput.checkInputPassword("Enter password: ");
            int userType = DataInput.checkInputInt("Enter user type: ");
            userList.add(new User(userCode, userName, password, userType));
        }
    }

    //lambthe150099
    public void deleteUser() {
        while (true) {
            int userCode = DataInput.checkInputInt("Enter user code: ");
            if (!DataInput.userExisted(userList, userCode)) {
                System.err.println("Id does not exist!");
                return;
            }

            for (int i = 0; i < userList.size(); i++) {
                if (userCode == userList.get(i).getUserId()) {
                    userList.remove(i);
                    break;
                }
            }
        }
    }
}
