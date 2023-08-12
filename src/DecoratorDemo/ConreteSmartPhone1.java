package DecoratorDemo;

public class ConreteSmartPhone1 extends SmartPhone{
    public ConreteSmartPhone1(Phone phone) {
        super(phone);
    }


    public void call() {
        super.call();
        changeColor();
    }
    public void changeColor(){
        System.out.println("智能变色。。。。");
    }
}
