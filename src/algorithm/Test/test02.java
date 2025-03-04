package algorithm.Test;

/**
 * @program: JavaTest
 * @description: 素数:指的是“大于1的整数中,只能被1和这个数本身整除的数”
 * @author: panyang
 * @create: 2021-05-19 20:36
 **/
// 题目：判断101-200之间有多少个素数，并输出所有素数。
public class test02 {
    public static void main(String[] args) {
        getPrimeNumber(101,200);
    }

    /**
     * 判断a和b之间有多少个素数
     * @param a
     * @param b
     */
    public static void getPrimeNumber(int a,int b){
        int sum = 0;
        if(a >= b){
            System.out.println("a不能大于等于b！");
        }
        System.out.print("素数：");
        for(int i=a;i<=b;i++){
            if(isPrimeNumber(i)){
                sum += 1;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("存在素数数量："+sum);
    }

    /**
     * 判断num是否是一个素数
     * @param i
     * @return
     */
    private static boolean isPrimeNumber(int i) {
        boolean flag = true;
        for(int j=2;j <= i/2;j++){
            if(i%j == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
