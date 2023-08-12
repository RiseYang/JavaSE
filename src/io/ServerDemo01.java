package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo01 {
    public static void main(String[] args) throws Exception {
        //1.建立一个socket服务
        ServerSocket serverSocket = new ServerSocket(8080);
        //2.监听客户端连接
        Socket socket = serverSocket.accept();
        //3.获取输入流
        InputStream is = socket.getInputStream();
        //4.文件输出
        FileOutputStream fos = new FileOutputStream(new File("receive.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        //5.关闭资源
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
