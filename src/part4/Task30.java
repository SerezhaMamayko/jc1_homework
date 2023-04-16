package part4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        Pattern p = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher m = p.matcher(str1);
        while(m.find()){
            System.out.println(m.start() + " " + m.end());

        }
    }
}
