package algorithm;


/**
 * @ClassName
 * @Description: TODO 水仙花数  它们每个位上的数字的3次幂之和等于它本身
 * @Author: yang
 * @CreateTime: 2022-11-08  08:54
 * @Version: 1.0
 */
public class ShuiXianHua {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            //个位
            int a = i%10;
            //十位
            int b = i/10%10;
            //百位
            int c = i/100;
            if(i ==a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }
}
