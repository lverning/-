package tools;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test05 {
    public static void main(String[] args) {
       TreeMap<String , String> tree = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);//按照字母顺序排
            }
        });
       tree.put("name","Jack");
       tree.put("aaa","kfbg");
       tree.put("aba","22");
       tree.put("abc","22");
       tree.put("bbb","22");
       tree.put("gao","172");
       tree.put("sex","man");
       tree.put("tizhong","70kg");
       for (Map.Entry<String , String>entry : tree.entrySet()){
           System.out.println(entry);
       }
    }
}
