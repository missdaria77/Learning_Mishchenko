package HomeWork11;

public class Main {
    public static void main(String[] args) {

        NewUser Anna = new NewUser("Anna", 22, 10, 1993, "anna.v@gmail.com", "+380994488311", "Ivanets", 55.0, "120/80", 6000);
        Anna.printAccountInfo();

        NewUser Oleg = new NewUser("Oleg", 23, 12, 1995, "oleg.v@gmail.com", "+380994488312", "Ivanets", 88.0, "122/80", 4000);
        Oleg.printAccountInfo();

        NewUser Daria = new NewUser("Daria", 2, 5, 2001, "mischenko_dasha@ukr.net", "+380934682146", "Mishchenko", 63.0, "110/75", 6000);
        Daria.printAccountInfo();

        NewUser Kate = new NewUser("Kate", 22, 11, 1999, "kate_k@ukr.net", "+380931234523", "Lindt", 59.0, "120/75", 6000);
        Kate.printAccountInfo();

        System.out.println("--- --- ---");

        Daria.setDailySteps(7000);
        Daria.setPressure("112/80");
        Daria.printAccountInfo();

        Kate.setPressure("130/90");
        Kate.setWeight(61.0);
        Kate.printAccountInfo();

    }
}
