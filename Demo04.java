package Demo01;

import java.io.*;

public class Demo04 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1准备输入输出流
            bis = new BufferedInputStream(new FileInputStream((new File("D:/VSCodeUserSetup-x64-1.55.1.exe"))));
            bos = new BufferedOutputStream(new FileOutputStream(new File("G:/VSCode.exe")));
            //2 循环读取操作
            int len = 0;
            byte[] buff = new byte[1024];//开辟缓冲区
            long start = System.currentTimeMillis();
            while ((len = bis.read(buff)) != -1) {
                bos.write(buff, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println("时间" + (end - start));
            //3 关闭输入输出资源
            bis.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
