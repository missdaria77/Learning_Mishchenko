package HomeWork13;

import java.util.Scanner;

public class FibonacciNum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("can't be calculated");
        } else
            System.out.println(fibonacciCalc(n));

    }

    public static int fibonacciCalc(int n) {
        int result;

        switch (n) {

            case 0 -> result = 0;
            case 1 -> result = 1;
            default -> result = fibonacciCalc(n - 1) + fibonacciCalc(n - 2);
        }
        return result;
    }
}
