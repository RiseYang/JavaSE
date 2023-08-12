package DecoratorDemo;

public class ConreteDecorator implements Phone{
    @Override
    public void call() {
        System.out.println("打电话....");
    }
}
