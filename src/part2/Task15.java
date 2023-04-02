package part2;

public class Task15 {
    public static void main(String[] args) {
        long i = 7893823445L;
        int sum = 0;
        do {
            sum+=i%10;
            i/=10;
        } while (i!=0);
        System.out.println(sum);
    }
}
