package java.interview;

public class StringDemo {


    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s1 == s2);//true   比较的是两个字符串相等
        System.out.println(s3 == s4);//false  s3和s4，这两个引用变量所指向的对象的内容都是一样的（内容都是abc，
        // 但是这两个对象是用new操作符创建处类的，是在内存中分配两块空间给这两个对象的，
        // 因而这两个对象的内存地址不一样，是两个不同的对象
    }

}
