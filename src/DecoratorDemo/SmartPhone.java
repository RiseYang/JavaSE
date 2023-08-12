package DecoratorDemo;

public abstract class SmartPhone implements Phone {
    private Phone phone;
    public SmartPhone(Phone phone){
        this.phone = phone;
    }

    @Override
    public void call(){
        phone.call();
    }
}
