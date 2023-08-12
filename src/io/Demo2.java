package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();

        //电脑d盘中的test.txt文档
        String filePath = "D:/test.txt";

        //要写的内容
        String context = "有Java，就有远方！";
        d2.writeFile(filePath, context);
    }

    /**
     * 根据文件路径创建输出流
     * 文件的路径
     * 需要写入的内容
     */
    public void writeFile(String filePath, String context) {
        FileOutputStream fos = null;
        try {
            //1.根据文件路径创建输出流
            fos = new FileOutputStream(filePath);
            //2.把string转换byte数组；
            byte[] array = context.getBytes();
            //3.把byte数组输出；
            fos.write(array);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}