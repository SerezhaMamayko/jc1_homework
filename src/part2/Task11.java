package part2;

import static java.lang.Math.max;

public class Task11 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 6;
        int e = 2;
        int f = 3;
        boolean length = ((e >= (a+b)) && f>=max(b,d));
        boolean high = ((f>=(b+d)) && e >= max(a,b));
        if (length || high) {
            System.out.println("Помещаются");
        }
        else {
            System.out.println("Не помещаются");
        }
    }
}
