package Demo02;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author： 吕二宁
 * @date： 2021-05-20 10:32
 */
public class Demo02 {
    public static void main(String[] args)  {
        String info[] = {"欢迎","来到","喵星人","的星球"};
        File file = new File("G:" +File.separator + "1.txt");

        try (FileOutputStream output = new FileOutputStream(file);
             FileChannel fout = output.getChannel();){
            ByteBuffer buf = ByteBuffer.allocate(1024);
            for (int i = 0; i<info.length;i++){
                //字符串变为字节数组放进缓冲区中
                buf.put(info[i].getBytes());
            }
            buf.flip();
            //输出缓冲区的内容
            fout.write(buf);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
