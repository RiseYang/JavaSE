package string;

/**
 * @创建人 panyang
 * @创建时间 14/7/2023
 * @描述
 */
public class Demo04StringConvert {

    public static void main(String[] args) {

        char[] chars = "hello".toCharArray();
        //转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //字符串替换
        String str2 = "Are you ok?";
        String str3 =str2.replace("o","k");
        System.out.println(str2);
        System.out.println(str3);
    }
}
