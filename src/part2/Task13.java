package part2;

public class Task13 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 1;
        System.out.println("Факториал 0=0");
        while (i<=10){
            sum = sum * i;
            System.out.println("Факториал "+i+"="+sum);
            i++;
        }
    }
}
