package part2;

public class Task16 {
    public static void main(String[] args) {
        boolean b = true;
        int counter = 0;
        for (int P = 50; P <= 70; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) counter++;
            else b = true;
            if (counter == 2) {
                System.out.println(P);
                break;
            }
        }
    }
}