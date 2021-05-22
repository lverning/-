package tools;

// STOPSHIP: 2021/5/7
import java.util.ArrayList;
import java.util.Collections;

public class Test04 {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        Collections.reverse(nums);
        System.out.println(nums);

        Collections.sort(nums);//排序方法
        System.out.println(nums);

        Collections.shuffle(nums);//混洗方法
        System.out.println(nums);

        System.out.println(Collections.max(nums));//求最大值
        System.out.println(Collections.min(nums));//求最小值
        Collections.replaceAll(nums,3,8);//替换所有符合条件的元素
        System.out.println(nums);
        System.out.println(Collections.frequency(nums,1));//查找元素在列表中出现的次数
        //先排序，后做二分搜索，查找对应的值在列表中是否出现，返回出现在列表中的位置索引
        Collections.sort(nums);
        System.out.println(Collections.binarySearch(nums,3));//二分搜索
    }

}
