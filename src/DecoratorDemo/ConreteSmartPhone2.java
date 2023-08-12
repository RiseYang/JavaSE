package DecoratorDemo;

public class ConreteSmartPhone2 extends SmartPhone{
    public ConreteSmartPhone2(Phone phone){super(phone);}

    @Override
    public void call() {
        super.call();
        //额外新功能
        changeSize();
    }
    public void changeSize(){
        System.out.println("智能变尺寸。。。");
    }
}
