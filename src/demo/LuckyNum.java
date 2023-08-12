package demo;

import java.util.Scanner;

/**
 * @创建人 panyang
 * @创建时间 4/8/2023
 * @描述 抽奖练习
 */
public class LuckyNum {
    public static void main(String[] args) {
        System.out.println("注册");
        String regName = "";
        String regPwd = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        regName = sc.next();
        System.out.println("请输入密码：");
        regPwd = sc.next();
        System.out.println("注册成功！");
        //随机生成4位数
        int vipNum = (int)(Math.random() * 9000)+1000;

        System.out.println("\n\n登录");
        String username = "";
        String password = "";
        System.out.println("登录用户名：");
        username = sc.next();
        System.out.println("登录密码：");
        password = sc.next();

        if(username.equals(regName) && password.equals(regPwd)){

            System.out.println("登录成功！");
            System.out.println("抽奖");

            int[] luckyNums = new int[6];
            //产生6个随机数幸运号码
            for (int i = 0; i <6 ; i++) {
                luckyNums[i] = (int)(Math.random() * 9000)+1000;
                System.out.println(luckyNums[i] + "\t");
            }
            System.out.println("你的vipNum" + vipNum);

            boolean flag = false;

            //判断vipNum是否存在于luckyNums中
            for (int i = 0; i <6 ; i++) {
                if(vipNum == luckyNums[i]){
            //        System.out.println("中奖");
                    flag =true; //中奖
                }
            }

            if(flag){
                System.out.println("中奖");
            }else{
                System.out.println("谢谢惠顾");
            }


        }else{
            System.out.println("失败，用户名或密码错误！");
        }
    }

}
