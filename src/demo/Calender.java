package demo;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        //打印年
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        //打印月
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        int days = 0; //定义天数
        //1900-2019年的天数
        for (int i = 1900; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
                days += 366;
            else
                days += 365;
        }
        //月份是31天的
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days += 31;
                    break;
                //月份是30天
                case 4:
                case 6:
                case 9:
                case 11:
                    days += 30;
                    break;
                default:
                    //根据年的闰/平年分析二月的天数
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        days += 29;
                    } else {
                        days += 28;
                    }
            }
        }
        days++;
        //分析  星期n =天数%7；
        int xingqi = days % 7;
        System.out.println(year + "年" + month + "月是星期：" + xingqi);
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
        //根据观察可得： 星期几 前面有几个空格（占位符）
        //空格（占位） ，占位符的个数 就是 星期n
        for (int i = 0; i < xingqi; i++) {
            System.out.print("\t\t");
        }
        //定义当月有多少天
        int daysOfMonth = -1;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            daysOfMonth = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysOfMonth = 30;
        } else {
            //根据年的闰/平年分析二月的天数
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                daysOfMonth = 29;
            } else {
                daysOfMonth = 28;
            }
        }
        //数字1-31（日期）
        for (int i = 1; i <= daysOfMonth; i++) {
            System.out.println(i + "\t\t"); //idea \t占四个字符
            if ((xingqi + i) % 7 == 0) {
                System.out.println();//回车
            }
        }

    }

}

