package demoClass;

/**
 * @program: JavaSE
 * @description:
 * @author: yang
 * @create: 2021-07-17 21:48
 **/
public class Hero {
    public String name;
    protected float hp;

    public static void main(String[] args) {
        Hero h1 = new Hero();
        Hero h2 = new Hero();
        Hero h3 ;
        Hero h4 ;
        h3 = h1;
        h4 = h3;
        System.out.println(h2);
        System.out.println(h4);
        System.out.println(h2==h4);
    }
}
