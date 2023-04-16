package part4;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println(str1.replaceAll("(<p>|<p[^<>]+>) ", "<p> "));
    }
}
