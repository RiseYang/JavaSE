package abstractAndInterfaces;

/**
 * 接口使用--工厂设计模式
 * @author yang
 *
 */
interface Fruit {
    public void eat();
}

class Apple implements Fruit {
    public void eat() {
        System.out.println("吃苹果。");
    }
};

class Orange implements Fruit {
    public void eat() {
        System.out.println("吃橘子");
    }
};

class Factory {
    public static Fruit getInstance(String className) {
        Fruit f = null;
        if ("apple".equals(className)) {
            f = new Apple();
        }
        if ("orange".equals(className)) {
            f = new Orange();
        }
        return f;
    }
};

public class TestByFruits {
    public static void main(String args[]) {
        Fruit f = Factory.getInstance("orange");
        f.eat();
    }
}

