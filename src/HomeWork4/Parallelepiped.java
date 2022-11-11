package HomeWork4;
import java.util.Scanner;

public class Parallelepiped {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the sides of the parallelepiped (one by one):");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        double volume = length * width * height;
        double pLength = 4 * (length + width + height);

        System.out.println("Parallelepiped Volume = " + volume);
        System.out.println("Length of parallelepiped edges = " + pLength);
    }
}
