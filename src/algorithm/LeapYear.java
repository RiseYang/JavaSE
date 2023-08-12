package algorithm;

import java.util.Scanner;
/**
 * 
 * @ClassName: LeapYear 
 * @Description: TODO 判断哪一年为闰年
 * @author: yang
 * @date: 2023年8月12日 下午1:48:14
 */
public class LeapYear {
    public static void main(String[] args) {
            //打印输出语句
            Scanner sc =new Scanner(System.in);
            System.out.println("请输入一个年份：");
            long year = sc.nextLong();
            //判断是否为闰年
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println(year+ "为闰年！");
            }else{
                System.out.println(year+ "为平年！");
        }
    }
}
