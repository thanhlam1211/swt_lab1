/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 *
 * @author kiennt
 */
public class FileUtil {

    private String filePath;

    public FileUtil(String filePath) {
        this.filePath = filePath;
    }

    public void writeObject(Object serObj) {

        try {

            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
//            COMMENTATOR: ĐINH TIẾN LÂM(HE153097)
//            Solution proposed on Sonarqube:
//            
//            try {
//                /* ... */
//            } catch (Exception e) {
//                LOGGER.log("context", e); // Compliant
//            }
            ex.printStackTrace();
        }
    }

    public void writeObjects(ArrayList<Object> objectList) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath, true);
//    COMMENTATOR: ĐINH TIẾN LÂM(HE153097)
//    Solution proposed on Sonarqube:
//              
//            FileOutputStream fos = new FileOutputStream(fileName);
//            ObjectOutputStream out = new ObjectOutputStream(fos);
            try {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for (Object anObject : objectList) {
                    try {
                        oos.writeObject(anObject);
                        System.out.println("saved");
                    } catch (NotSerializableException e) {
                        System.out.println("An object was not serializable, it has not been saved.");
                        //            COMMENTATOR: ĐINH TIẾN LÂM(HE153097)
//            Solution proposed on Sonarqube:
//            
//            try {
//                /* ... */
//            } catch (Exception e) {
//                LOGGER.log("context", e); // Compliant
//            }
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                //            COMMENTATOR: ĐINH TIẾN LÂM(HE153097)
//            Solution proposed on Sonarqube:
//            
//            try {
//                /* ... */
//            } catch (Exception e) {
//                LOGGER.log("context", e); // Compliant
//            }
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            //            COMMENTATOR: ĐINH TIẾN LÂM(HE153097)
//            Solution proposed on Sonarqube:
//            
//            try {
//                /* ... */
//            } catch (Exception e) {
//                LOGGER.log("context", e); // Compliant
//            }
            e.printStackTrace();
        }

    }

//    COMMENTATOR: ĐINH TIẾN LÂM(HE153097)
//    Solution proposed on Sonarqube:
//   
//    private void readTheFile(String fileName) throws IOException {
//        Path path = Paths.get(fileName);
//        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
//            reader.readLine();
//            // ...
//        }
//        // ..
//        try (Stream<String> input = Files.lines("input.txt")) {
//            input.forEach(System.out::println);
//        }
//    }
//
//    private void doSomething() {
//        OutputStream stream = null;
//        try {
//            stream = new FileOutputStream("myfile.txt");
//            for (String property : propertyList) {
//                // ...
//            }
//        } catch (Exception e) {
//            // ...
//        } finally {
//            stream.close();
//        }
//    }
    public static ArrayList<Object> readObjects() {
        ArrayList<Object> objectList = new ArrayList<Object>();
        boolean cont = true;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("outputFile"));
            while (cont) {
                Object obj = null;
                try {
                    obj = ois.readObject();
                } catch (ClassNotFoundException e) {
//            COMMENTATOR: ĐINH TIẾN LÂM(HE153097)
//            Solution proposed on Sonarqube:
//            
//            try {
//                /* ... */
//            } catch (Exception e) {
//                LOGGER.log("context", e); // Compliant
//            }
                    e.printStackTrace();
                }
                if (obj != null) {
                    objectList.add(obj);
                } else {
                    cont = false;
                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
//            COMMENTATOR: ĐINH TIẾN LÂM(HE153097)
//            Solution proposed on Sonarqube:
//            
//            try {
//                /* ... */
//            } catch (Exception e) {
//                LOGGER.log("context", e); // Compliant
//            }
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
//            COMMENTATOR: ĐINH TIẾN LÂM(HE153097)
//            Solution proposed on Sonarqube:
//            
//            try {
//                /* ... */
//            } catch (Exception e) {
//                LOGGER.log("context", e); // Compliant
//            }
            e.printStackTrace();
        }

        return objectList;
    }

}
