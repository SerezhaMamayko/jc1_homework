package part6.task46;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        try {
            System.out.println(div (a, b));
        } catch (ArithmeticException e) {
            System.out.println("Can't div by zero");
        }
    }
    public static double div (double a, double b) {
        return a/b;
    }
}
