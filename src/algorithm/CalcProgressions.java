package algorithm;

/**
 * @className: CalcProgressions
 * @author: yang
 * @date: 2025/2/15 12:53
 * @Version: 1.0
 * @description:数列算法 a=2 , b=5, s=2+22+222+2222+22222
 */
public class CalcProgressions {

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        long s =calc(a, b);
        System.out.println("sum s = " + s);
    }

    private static long calc(int a, int b) {
        long sum = 0;
        int m = a;
        for (int i = 1; i < b; i++) {
            sum += m;
            m = m * 10 + a;
        }
        return sum;
    }

}