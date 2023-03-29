package part2;

import java.lang.Math;

public class Task8 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int r = 5;
        double c = Math.sqrt(Math.pow (a,2) + Math.pow(b,2));
        if (c == r){
            System.out.println("Можно");
        }
        else {
            System.out.println("Нельзя");
        }
    }
}
