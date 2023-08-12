package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @program: JavaTest
 * @description: 创建文件
 * @author: panyang
 * @create: 2021-05-11 21:33
 **/
public class Filetest {
    public static void main(String[] args) {
        //new一个文件对象
        File file = new File("D:\\demowenjian");
        //判断 如果文件夹不存在
        if(!file.exists()){
            //创建文件夹
            file.mkdir();
        }
        //如果demo文件夹下没有test.txt就会创建该文件
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\demowenjian\\test.txt"));
            //在创建好的文件中写入"Hello I/O"
            bw.write("Hello I/O!");
            //一定要关闭文件
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
