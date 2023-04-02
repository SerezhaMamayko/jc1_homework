package part2;


import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String f = Integer.toString(n);
        for (int i = 3; i < f.length(); i+=3){
            if (f.length() - i >= i/3){
                String before = f.substring(0, i + (i/3 - 1));
                String after = f.substring(i + (i/3 - 1), f.length());
                f = before + " " + after;
            }
        }

        System.out.println(f);
        }
    }

