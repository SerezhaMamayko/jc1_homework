package part4;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        int before = str1.length();
        int after = str1.replaceAll("[,.!?'()-;:]", "").length();
        System.out.println("Количество знаков препинания в тексте: " + (before - after));
    }
}
