package algorithm;

/**
 * @ClassName
 * @Description: TODO 杨辉三角
 * @Author: yang
 * @CreateTime: 2022-11-08  09:46
 * @Version: 1.0
 */
public class Yanghui {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j <6-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
