package DecoratorDemo;

//装饰模式  在原来的基础上额外增加新功能
public class Test {
    public static void main(String[] args) {
        ConreteDecorator phone = new ConreteDecorator();
        //主题（被装饰者）
        phone.call();
        System.out.println("-------------");

        ConreteSmartPhone1 phone1 = new ConreteSmartPhone1(phone);
        phone1.call();

        System.out.println("-------------");

        ConreteSmartPhone2 phone2 = new ConreteSmartPhone2(phone);
        phone2.call();

        System.out.println("--------------");
        SmartPhone smart = new ConreteSmartPhone2(new ConreteSmartPhone1(phone));
        smart.call();
    }
}
