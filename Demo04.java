package Demo02;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author： 吕二宁
 * @date： 2021-05-20 11:20
 */
public class Demo04 {
    public static void main(String[] args)throws IOException {
        int port = 8000;
        //通过open()方法找到Selector.open();
        Selector selector = Selector.open();
        //打开服务器的通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //服务器配置为非阻塞
        serverSocketChannel.configureBlocking(false);
        ServerSocket serverSocket = serverSocketChannel.socket();
        InetSocketAddress address = new InetSocketAddress(port);

        //进行服务的绑定
        serverSocket.bind(address);
        //注册到selector，等待连接
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("服务器运行，端口：" + port);
        //数据缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        while (true){
            if ((selector.select())>0){
                //选择一条组建，并且相应的通道已经准备就绪
                //取出全部生成的key
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iter = selectionKeys.iterator();

                while (iter.hasNext()){

                }
            }
        }
    }
}
