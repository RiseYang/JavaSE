package demo;

public class IfDemo {
    public static void main(String[] args) {
        //if判断列子  xm90分  zs  ,如果大于90，则奖励一部iPhone 11，否则打一顿
//        int xm = 90;
//        int zs = 60,
//        if(zs>xm){
//            System.out.println("奖励一部iPhone11");
//
//        }else{
//            System.out.println("打一顿");
//        }
 /*       //随机数
        //三位随机数   三位数中最大的整百数 --》 [0,900) --->int ---> [0, 899) + 100 ---> [100,999]
        int num = (int)(Math.random()*900)+100;
        System.out.println(num);*/

        //用if else语句判断num>=90优秀 ，80=< num <=90 良好   60=< num <80 及格   num<60  不及格
  /*      int num =66;
        if (num>=90){
            System.out.println("优秀");
        }else if(num <90){
            System.out.println("良好");
        }else if(num <80){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
*/
        //1.管理员   2. 用户    3.超级vip用户
        int xm = 3;
        switch (xm) {
            case 1:
                System.out.println("管理员");
                break;
            case 2:
                System.out.println("用户");
                break;
            case 3:
                System.out.println("超级VIP用户");
                break;
        }

    }
}
