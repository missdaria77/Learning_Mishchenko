package HomeWork2_2;
/*
Створити клас Car з публічним методом start. Метод start викликає у собі методи:
        - startElectricity()
        - startCommand()
        - startFuelSystem()
Перелічені методи, є внутрішньою (прихованою) частиною комплексного методу start.
Вони по суті відображають внутрішню поведінку класу Car і не повинні використовуватися за межами даного класу.
 */

public class Car {

    public static void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }


    private static void startElectricity() {

    }

    private static void startCommand() {

    }

    private static void startFuelSystem() {

    }

}
