package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();

        //电脑d盘中的test.txt文档
        String filePath = "D:/test.txt";
        String result = d1.readFile(filePath);
        System.out.println(result);
    }

    /**
     * 读取指定文件的内容
     * 文件的路径
     * 返回的结果
     */
    public String readFile(String filePath) {
        FileInputStream fis = null;
        String result = "123";
        try {
            //1.根据path路径实例化一个输入流的对象
            fis = new FileInputStream(filePath);
            //2.返回这个输入流中可以被读的剩下的bytes字节的估计值；
            int size = fis.available();
            //3.根据输入流中的字节流创建byte数组；
            byte[] array = new byte[size];
            //4.把数据读取到数组中；
            fis.read(array);
            //5.根据获取到的Byte数组新建一个字符串，然后输出
            result = new String(array);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }


}
