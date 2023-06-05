package part6.task43;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        Map<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (counter.containsKey(str[i])) {
                int count = counter.get(str[i]);
                counter.put(str[i], count + 1);
            } else {
                counter.put(str[i], 1);
            }
        }
        System.out.println("Repeats: " + counter);
    }
}
