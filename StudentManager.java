package 图书管理;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<>();
        boolean flag = true;
        do {
            System.out.println("-----------欢迎进入图书管理系统-----------");
            System.out.println("1 新增图书");
            System.out.println("2 查看图书");
            System.out.println("3 删除图书");
            System.out.println("4 借出图书");
            System.out.println("5 归还图书");
            System.out.println("6 退出");
            System.out.println("请输入你的选择:");
            Scanner scanner = new Scanner(System.in);
            int line = scanner.nextInt();
            switch (line) {
                case 1:
                    tianjia(array);
                    break;
                case 2:
                    chakan(array);
                    break;
                case 3:
                    shanchu(array);
                    break;
                case 4:
                    jiechu(array);
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("退出");
                    flag = false;
                    break;
            }
        } while (flag);
    }

    ///定义一个方法，用于添加图书信息
    public static void tianjia(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书编号:");
        String sid = scanner.nextLine();
        System.out.println("请输入图书名字:");
        String name = scanner.nextLine();
        System.out.println("请输入图书页数:");
        String age = scanner.nextLine();
        System.out.println("请输入图书日期:");
        String address = scanner.nextLine();
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);
        System.out.println("新增图书成功");
    }

    //定义一个方法，用于查看图书信息
    public static void chakan(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息，请先添加图书信息");
            //把程序停止
            return;
        }
        System.out.println("编号 \t 名字 \t 页数 \t 日期");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t" + s.getAge() + "\t\t" + s.getAddress());
        }
    }
    //定义一个方法，用于删除图书信息
    public static void shanchu(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要删除的图书编号:");
        String sid = scanner.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                break;
            }
        }
        System.out.println("删除图书成功");
    }
    public static void jiechu(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要借出的图书编号:");
        String sid = scanner.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                System.out.println("借出图书成功");
                break;
            }else {
                System.out.println("借出图书失败");
            }
        }
    }
    public static void xougai(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改图书的编号:");
        String sid = scanner.nextLine();
        System.out.println("请输入要修改图书的名字:");
        String name = scanner.nextLine();
        System.out.println("请输入要修改图书的页数:");
        String age = scanner.nextLine();
        System.out.println("请输入要修改图书的日期:");
        String address = scanner.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        for (int i = 0;i<array.size();i++){
            Student student = array.get(i);
            if (student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }
        System.out.println("修改成功");
    }
}

