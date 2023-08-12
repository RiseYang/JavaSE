package demoClass;

/**
 * @program: Java-study
 * @description:设计一个类Armor护甲
 * 继承Item类，并且额外提供一个属性ac: 护甲等级 int类型
 *
 * 实例化出两件护甲
 * 名称 价格 护甲等级
 * 布甲 300 15
 * 锁子甲 500 40
 * @author: yang
 * @create: 2021-07-17 21:59
 **/
public class Armor extends Item{

    int ac;

    public static void main(String[] args) {
        Armor ar = new Armor();
        ar.name = "布甲";
        ar.price = 300;
        ar.rank = 15;
        Armor ar2 = new Armor();
        ar2.name = "锁子甲";
        ar2.price = 500;
        ar2.rank = 40;
    }



}
