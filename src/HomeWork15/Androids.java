package HomeWork15;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("your Samsung is ringing - ring-ring");
    }

    @Override
    public void sms() {
        System.out.println("you have just received a message on your Samsung");
    }

    @Override
    public void internet() {
        System.out.println("your Samsung is connected to the network");
    }

    @Override
    public void os() {
        System.out.println("your os is LinuxOS");
    }
}
