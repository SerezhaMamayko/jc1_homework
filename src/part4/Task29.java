package part4;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        StringBuilder res = new StringBuilder();
        String [] words = str1.split("\\s+");
        for ( String word : words )
            res.append(word.toCharArray()[word.length() - 1]);

        System.out.println("Result: " + res);
    }
}
