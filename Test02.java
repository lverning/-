package tools;

import java.util.Arrays;
import java.util.HashSet;

// STOPSHIP: 2021/5/7 去重
public class Test02 {
    public static void main(String[] args) {
        String [] str = new String[]{"1","2","3","4","5","5"};
        //将数组先转为List，再把List转为set
        HashSet<String> set = new HashSet<>(Arrays.asList(str));
        for (String s : set){
            System.out.println(s);
        }
        String [] strings = new String[]{"123","123","456"};
        HashSet<String> strings1 = new HashSet<>(Arrays.asList(strings));
        for (String b : strings1){
            System.out.println(b);
        }
        //将set转为数组 集合.toArray()
        Object[] objects = set.toArray();
        for (int i = 0; i<objects.length; i++){
            System.out.print(objects[i] + "\t");
        }
        System.out.println();
        for (Object o : objects){
            System.out.print(o +"\t");
        }
    }
}
