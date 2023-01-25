package basic.work6;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int attemptsNumber = 4;
        int unknownNumber = 2;
        System.out.println("Please, enter your number (from 0 to 10):");

        for(int i = 0; i < attemptsNumber; i++) {

            int enteredNumber = scanner.nextInt();

            if (unknownNumber == enteredNumber){
                System.out.println("Good Job!");
                break;
            }
            else {
                if (i == attemptsNumber - 1){
                    System.out.println("Attempts are over!");
                }
                else {
                    System.out.println("Please, try again!");
                }
            }
        }
    }
}
