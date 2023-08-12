package string;

/**
 * @创建人 panyang
 * @创建时间 14/7/2023
 * @描述 string获取的常见方法
 * public int length():获取字符串当中含有的字符个数，拿到字符串长度
 * public String concat(String str): 将当前字符串和参数字符串拼接成为返回值新的字符串
 * public char charAt(int index): 获取指定索引位置的单个字符，（索引从0开始）
 * public int indexOf(String str): 查找参数字符串在本字符串中首次出现的索引位置，如果没有返回-1值
 *
 */
public class Demo02StringGet {

    public static void main(String[] args) {
        int length = "adsfdfdfdfdgdd".length();
        //String的长度
        System.out.println("length的长度为:"+ length);

        String str1 = "ABC";
        String str2 = "DEF";
        String str3 = str1.concat(str2);
        System.out.println("拼接为:"+str3);

        char ch = "abcefg".charAt(2);
        System.out.println("该索引位置:"+ch);

        String str4 = "dsaggadasjgfjfg";
        int index = str4.indexOf("agg");
        System.out.println("该索引值为:"+ index);

    }
}
