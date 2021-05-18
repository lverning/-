package Demo01;

import java.io.File;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\typora-setup-x64.exe");
        File file2 = new File("D:\\大电影.mp4");
        File file3 = new File("D:/Demo011");
        File file4 = new File("D:/Demo011/Demo1.1");
        File file5 = new File("D:/kdesk_33_1.exe");
        File file6 = new File("D:\\Temp\\TxGameDownload/APK");
        //1.创建一个文件
        file2.createNewFile();
        //2.创建一个文件夹 mkdir一个只能创建一个文件夹，如果父路径没有则创建失败
        file2.createNewFile();
        boolean res = file3.mkdir();
        System.out.println(res);
        //mkdirs 创建多个文件夹，如果父路径不存在，则一次性创建全部路径
        file4.mkdirs();
        //4.删除文件
        file2.delete();
        //5.renameTo 移动文件
        file2.renameTo(new File("C:/jihuo.exe"));
        //6.判断文件是否存在
        System.out.println(file2.exists());
        //7.isFile
        System.out.println(file5.isFile());
        //8.isDirectory
        System.out.println(file5.isDirectory());
        //9.getPath()获取路径
        System.out.println(file6.getPath());
    }
}
