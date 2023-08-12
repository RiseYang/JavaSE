package string;

/**
 * @创建人 panyang
 * @创建时间 14/7/2023
 * @描述 分割字符串
 */
public class Demo05StringSplit {

    public static void main(String[] args) {
        String str1 = "aa,bbb,cc";
        String[] arr = str1.split(",");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
