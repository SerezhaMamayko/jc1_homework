package part2;

public class Task7 {
    public static void main(String[] args) {
        int i = 207;
        boolean bool = false;
        System.out.println(result (i, bool));
    }
    static boolean result (int a, boolean b){
        if (a % 10 == 7){
            return b = true;
        }
        else {
            return b = false;
        }
    }
}
