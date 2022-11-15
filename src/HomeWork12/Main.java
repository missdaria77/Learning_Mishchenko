package HomeWork12;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please place your order: ");

        double bill = 0;
        boolean exit = true;
        while (exit) {
            for (Drinks drink : Drinks.values()) {
                if (drink.equals(Drinks.UNDEFINED)) continue;
                System.out.println(drink);
            }
            String order = scanner.next();
            Drinks drink = getDrink(order);

            CoffeeMachine orderedDrink = new CoffeeMachine(drink);
            switch (drink) {

                case COFFEE -> {
                    System.out.println(orderedDrink.prepareDrink());
                    bill = bill + Drinks.COFFEE.price;
                }
                case TEA -> {
                    System.out.println(orderedDrink.prepareDrink());
                    bill = bill + Drinks.TEA.price;
                }
                case LEMONADE -> {
                    System.out.println(orderedDrink.prepareDrink());
                    bill = bill + Drinks.LEMONADE.price;
                }
                case MOJITO -> {
                    System.out.println(orderedDrink.prepareDrink());
                    bill = bill + Drinks.MOJITO.price;
                }
                case WATER -> {
                    System.out.println(orderedDrink.prepareDrink());
                    bill = bill + Drinks.WATER.price;
                }
                case COLA -> {
                    System.out.println(orderedDrink.prepareDrink());
                    bill = bill + Drinks.COLA.price;
                }
                default -> System.out.println("Please remake your order or finish!");
            }
            System.out.println("Are you ready to finish? ('yes'/'no')");
            exit = scanner.next().equals("no");
        }
        System.out.println("Your amount to pay is: " + bill);

    }

    private static Drinks getDrink(String name) {
        for (Drinks drink : Drinks.values()) {
            if (drink.toString().equalsIgnoreCase(name)) {
                return drink;
            }

        }
        return Drinks.UNDEFINED;
    }

}

