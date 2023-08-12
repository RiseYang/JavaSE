package io;


import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo01 {
    public static void main(String[] args) throws Exception {
        //1.建立一个socket
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8080);
        //2.创建一个输出流
        OutputStream os = socket.getOutputStream();
        //3.读取文件
        FileInputStream fis = new FileInputStream(new File("66a.jpg"));
        //4.写出文件
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer, 0, len);
            //5.关闭资源
        }
        fis.close();
        os.close();
        socket.close();
    }
}
