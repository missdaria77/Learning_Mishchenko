package HomeWork15;
/*
Сделайте интерфейс Smartphones, который должен содержать методы call(), sms(), internet()
Сделайте классы которые его имплементируют: Androids, iPhones.
Андроиды должны также имплементировать LinuxOS, айфоны в свою очередь должны имплементировать iOS
Создайте экземпляры каждого вида в мейн-классе
 */
public class Main {

    public static void main(String[] args) {

        Iphones iPhone = new Iphones();
        Androids Samsung = new Androids();

        iPhone.call();
        Samsung.sms();

        System.out.println("--- --- ---");

        iPhone.os();
        Samsung.os();

    }


}
