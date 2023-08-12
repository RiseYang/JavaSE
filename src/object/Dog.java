package object;

public class Dog {
    private String breed; //品种
    private String size; //大小
    private String color; //颜色
    private int age; //年龄
    //构造方法
    public Dog(String breed){
        this.breed = breed;
    }


    public void dogSize(String size,String color,int age){
        System.out.println("大小:"+size+",颜色:"+color +",年龄:" + age);

    }
    public void run(){
        System.out.println("狗子在跑。。");

    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("斗牛犬");
        dog1.dogSize("大","浅灰色",5);
        Dog dog2 = new Dog("小猎犬");
        dog2.dogSize("大","橘色",6);
        dog2.run();
    }
}
