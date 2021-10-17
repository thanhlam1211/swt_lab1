package common;

import model.Fruit;
import model.Order;
import java.util.ArrayList;
import java.util.Scanner;
import model.User;

public class DataInput {

    private static final Scanner in = new Scanner(System.in);
    private static final String PASS_VALID = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$";

    //check user input number limit
    public static int checkInputIntLimit(String msg, int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                System.out.print(msg);
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]\nPlease enter again!");
            }
        }
    }

    public static String checkPassword(String msg) {
        while (true) {
            System.out.print(msg);
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty! Please enter again!");
            } else if (!result.matches(PASS_VALID)) {
                System.out.println("Password must include more than 6 chars, both letter and numbers!");
            } else {
                return result;
            }
        }
    }
    
    public static boolean checkNameDuplicate(ArrayList<User> userList, String userName) {
        for (User user : userList) {
            if (userName.equalsIgnoreCase(user.getUserName()) ) {
                return true;
            }
        }
        return false;
    }

    public static String checkInputUserName(String msg) {
        char ch = msg.charAt(0);
        while (true) {
            System.out.println(msg);
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else if (!Character.isAlphabetic(ch)) {
                System.err.println("User name must start with a character");
                System.out.print("Enter again: ");
            } else if (result.length() < 5) {
                System.err.println("User name leght must >= 5 character");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static String checkInputPassword(String msg) {
        char ch = msg.charAt(0);
        while (true) {
            System.out.println(msg);
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            }
            boolean valid = msg.length() >= 6;
            if (!valid) {
                System.out.println("Password must have at least 6 characters.");
            } else {
                for (char c : msg.toCharArray()) {
                    if (!Character.isLetter(c) && !Character.isDigit(c)) {
                        System.out.println("Password can only contain letters and numbers.");
                        System.out.print("Enter again: ");
                        valid = false;
                        break;
                    }
                }
            }
            if (valid) {
                System.out.println("Password accepted!");
                return result;
            }
        }
    }

    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    //check user input string
    public static String checkInputString(String smg) {
        //loop until user input correct
        while (true) {
            System.out.println(smg);
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    /*
    Commentator: LAMDTHE153097
    
    HÀM CHECK STRING GỢI Ý ĐỂ THAY THẾ:
    
     public String getString(String msg, String err, String regex) {
        String str;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(msg);
            str = sc.nextLine();

            if (str.trim().equals("")) {
                continue;
            }
            // kiem tra str voi dinh dang
            if (!str.matches(regex)) {
                System.out.println(err);
                continue;
            }
            return str;
        }
    }
     */
    //check user input int
    public static int checkInputInt(String smg) {
        //loop until user input correct
        while (true) {
            System.out.println(smg);
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input integer.");
                System.out.print("Enter again: ");
            }
        }
    }

    //check user input double
    public static double checkInputDouble(String smg) {
        //loop until user input correct
        while (true) {
            System.out.println(smg);
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }

        }
    }

    /*   
    Commentator: LAMDTHE153097
    
    HÀM CHECK DOUBLE GỢI Ý ĐỂ THAY THẾ

    public static double checkInputDouble(String smg, double min, double max) {
        //loop until user input correct
        while (true) {
            System.out.println(smg);
            try {
                double result = Double.parseDouble(in.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]\nPlease enter again!");
            }

        }
    }
     */
    //check user input yes/ no
    public static boolean checkInputYN() {
        System.out.print("Do you want to continue (Y/N)? ");
        //loop until user input correct
        while (true) {
            String result = checkInputString("");
            //return true if user input y/Y
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            //return false if user input n/N
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    //check id exist
    public static boolean fruitExisted(ArrayList<Fruit> lf, int id) {
        for (Fruit fruit : lf) {
            if (id == fruit.getFruitId()) {
                return true;
            }
        }
        return false;
    }

    //check id exist
    public static boolean userExisted(ArrayList<User> userList, int userCode) {
        for (User user : userList) {
            if (userCode == user.getUserId()) {
                return true;
            }
        }
        return false;
    }

    //check item exist or not
    public static boolean checkItemExist(ArrayList<Order> lo, int id) {
        for (Order order : lo) {
            if (order.getFruitId().equalsIgnoreCase(id + "")) {
                return false;
            }
        }
        return true;
    }
}
