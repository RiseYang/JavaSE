package algorithm.Test;

/**
 * @program: JavaTest
 * @description: 水仙花
 * @author: panyang
 * @create: 2021-05-19 20:46
 **/

/**
 * 题目：打印出所有的”水仙花数”，所谓”水仙花数”是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个”水仙花数”，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class test03 {
    public static void main(String[] args) {
        //for循环
        for(int i = 100; i<1000; i++){
            //个位
            int gewei = i%10;
            //十位
            int shiwei = i/10%10;
            //百位
            int baiwei = i/100;
            if(i==gewei * gewei *gewei + shiwei *shiwei*shiwei + baiwei * baiwei *baiwei ){
                System.out.println(i);
            }
        }
    }
}
