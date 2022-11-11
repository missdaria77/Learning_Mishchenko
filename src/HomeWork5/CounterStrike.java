package HomeWork5;

import java.util.Scanner;
public class CounterStrike {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name of the first team:");
        String name1 = scanner.next();
        System.out.println("Please enter number of frags for 5 players from the team " + name1 + " (one by one):");
        double team1Player1 = scanner.nextDouble();
        double team1Player2 = scanner.nextDouble();
        double team1Player3 = scanner.nextDouble();
        double team1Player4 = scanner.nextDouble();
        double team1Player5 = scanner.nextDouble();

        System.out.println("Please enter the name of the second team:");
        String name2 = scanner.next();
        System.out.println("Please enter number of frags for 5 players from the team " + name2 + " (one by one):");
        double team2Player1 = scanner.nextDouble();
        double team2Player2 = scanner.nextDouble();
        double team2Player3 = scanner.nextDouble();
        double team2Player4 = scanner.nextDouble();
        double team2Player5 = scanner.nextDouble();

        double resTeam1 = (team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5)/5;
        double resTeam2 = (team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5)/5;

        if (resTeam1 > resTeam2) {
            System.out.println("Winner is team " + name1 + " with " + resTeam1 + " points!");
        }
        else if (resTeam1 < resTeam2) {
            System.out.println("Winner is team " + name2 + " with " + resTeam2 + " points!");
        }
        else {
            System.out.println("Dead heat!");
        }

    }
}
