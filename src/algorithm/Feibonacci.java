package algorithm;

/**
 * @program: JavaTest
 * @description: 算法题  斐波那契数列
 * @author: panyang
 * @create: 2021-05-19 17:48
 **/
public class Feibonacci {
    public static int fibonacci(int n){
        if(n ==1 || n==2){
            return 1;
        }
        if(n>2){
            return fibonacci(n-1) + fibonacci(n-2);
        }
        return -1;
    }

}