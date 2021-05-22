package tools;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test06 {
    public static void main(String[] args) {
        List<User>list = new ArrayList<User>();
        list.add(new User(110,"MAke"));
        list.add(new User(100,"张三"));
        list.add(new User(111,"李四"));
        list.add(new User(112,"Jack"));

        Collections.sort(list);
        for (User user : list){
            System.out.println(user);
        }

    }
}
