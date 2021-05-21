package Demo02;

import java.io.*;

/**
 * @author： 吕二宁
 * @date： 2021-05-20 08:09
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("G:/1.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        String line = null;
        while ((line = (br.readLine())) != null){
            osw.write(line + "\n");
        }
        osw.flush();
        br.close();
        osw.close();
    }
}
