package algorithm.Test;

/**
 * @program: JavaTest
 * @description: 练习题
 * @author: panyang
 * @create: 2021-05-19 19:44
 **/

import java.util.Scanner;

/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 * 分析 一月 1对， 2月 1对，3月 2对，4月 3对，5月5对，6月8对，7月13对，8月 21只
 */
public class test01 {
    public static void main(String[] args) {
        System.out.println("请输入兔子的月份：");
        //键盘输入
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(test(n));
        sc.close();
    }
    public static int test(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (n > 2) {
            return test(n - 1) + test(n - 2);
        }
        return n;
    }

}
