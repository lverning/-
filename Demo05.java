package Demo02;

import java.io.*;

/**
 * @author： 吕二宁
 * @date： 2021-05-20 16:09
 */
public class Demo05 {
    public static void main(String[] args)   {
        User user = new User();
        user.setName("小明");
        user.setAge(18);
        System.out.println(user);

        try (ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream("tempFile"))) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("tempFile");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            User newUser = (User) ois.readObject();
            System.out.println(newUser);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
