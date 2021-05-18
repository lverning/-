package Demo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) {
        FileInputStream fis;
        FileOutputStream fos;
        try {
            //1准备输入输出流
            fis = new FileInputStream(new File("D:/VSCodeUserSetup-x64-1.55.1.exe"));
            fos = new FileOutputStream(new File("G:/VSCode.exe"));
            //2 循环读取操作
            int len = 0;
            byte[] buff = new byte[1024];//开辟缓冲区
            while ((len = fis.read(buff)) != -1) {
                fos.write(buff, 0, len);
            }
            //3 关闭输入输出资源
            fis.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
