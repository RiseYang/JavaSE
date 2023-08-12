package string;

/**
 * @创建人 panyang
 * @创建时间 14/7/2023
 * @描述  三种字符串的构造
 */
public class Demo01String {
    public static void main(String[] args){
        //创建一个空的字符串
        String str1 = new String();
        System.out.println("第一种字符串:"+ str1);
        //根据字符数组创建
        char[] charArr = {'A','B','C'};
        String str2 = new String(charArr);
        System.out.println("第二种字符串:"+ str2);
        //根据字节数组创建字符串
        byte[] bytes = {97,98,99};
        String str3 = new String(bytes);
        System.out.println("第三种字符串:"+ str3);
    }
}
//比较总结： 基本数据：==比较两个值相等
//          引用数据： ==比较两个地址值相等

//  equals  比较两个值的内容相等