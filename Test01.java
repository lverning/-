package tools;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        String str[] = {"中文","计算机","ABC","123","@qq.com"};
        List<String> strlist = Arrays.asList(str);
        for (String string : strlist){
            System.out.println(string+"\t");
        }
        System.out.println();
        //2 newArraylist<>(Arrays.asList(str))把数组转换成Arrays
    }
}
