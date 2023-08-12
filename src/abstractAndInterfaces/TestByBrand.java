package abstractAndInterfaces;
/**
 * 抽象类的使用，继承和多态
 * @author yang
 *
 */
abstract class Car {
    public void run() {
    }

    public void stop() {
    }

}

class Benz extends Car {
    @Override
    public void run() {
        System.out.println("Benz开始启动了...");
    }

    @Override
    public void stop() {
        System.out.println("Benz停止了...");
    }
}

class Ford extends Car {
    @Override
    public void run() {
        System.out.println("Ford开始启动了...");
    }

    @Override
    public void stop() {
        System.out.println("Ford停止了...");
    }
}

//判断调用哪个实例
class Brand {
    public static Car getCarInstance(String type) {
        Car c = null;
        if ("Benz".equals(type)) {
            c = new Benz();
        }
        if ("Ford".equals(type)) {
            c = new Ford();
        }
        return c;
    }
}

public class TestByBrand {
    public static void main(String[] args) {
        Car c = Brand.getCarInstance("Benz");
        c.run();
        c.stop();
    }
}
