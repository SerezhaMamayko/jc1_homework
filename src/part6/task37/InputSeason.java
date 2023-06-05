package part6.task37;

import java.util.Locale;
import java.util.Scanner;

public class InputSeason {
    public String inputSeason (){
        System.out.println("Input one of four: Winter, Summer, Autumn, Spring");
        return new Scanner(System.in).next().toLowerCase(Locale.ROOT);
    }
}
