package string;

/**
 * @创建人 panyang
 * @创建时间 14/7/2023
 * @描述 字符串截取
 */
public class Demo03StringSubstring {

    public static void main(String[] args) {
        String str1 = "asdfghjkl";
        String substring = str1.substring(3);
        System.out.println("截取的字符串为:"+ substring);

        String substring2 = str1.substring(2, 5);
        System.out.println("截取的为:"+ substring2);
    }
}
