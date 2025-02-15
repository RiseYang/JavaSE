package algorithm;

import java.util.Scanner;

/**
 * @className: StringUppercase
 * @author: yang
 * @date: 2025/2/15 13:00
 * @Version: 1.0
 * @description:字符串倒序并转换小写转大写 如: aaBBCcDd  dDcCbbAA
 */
public class StringUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] ch = str.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = str.length() - 1; i >=0 ; i--) {
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                sb.append(String.valueOf(ch[i]).toLowerCase());
            }else if(ch[i] >= 'a' && ch[i] <= 'z'){
                sb.append(String.valueOf(ch[i]).toUpperCase());
            }
        }
        System.out.println(sb.toString());
    }
}