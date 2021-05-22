package tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test03 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("1","A");
        map.put("2","B");
        map.put("3","C");
        //取出所有键的值作为一个集合
        System.out.println(map.keySet());
        //取出所有的值，把值放在一个List中 new AyyayList<>(接收一个集合)
        ArrayList<String> strings = new ArrayList<>(map.values());
        for (int i = 0; i<strings.size(); i++){
            System.out.print(strings.get(i));
        }
        System.out.println();
        for (String s : strings){
            System.out.print(s);
        }
    }
}
