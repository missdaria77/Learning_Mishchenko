package basic.work15;

public class Iphones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("your iPhone is ringing - ring-ring");
    }

    @Override
    public void sms() {
        System.out.println("you have just received a message on your iPhone");
    }

    @Override
    public void internet() {
        System.out.println("your iPhone is connected to the network");
    }

    @Override
    public void os() {
        System.out.println("your os is IOS");
    }
}
