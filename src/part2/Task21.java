package part2;

public class Task21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 5, 6, 7, 8, 9, 4};
        int arrMax = 0;
        for (int elem: arr){
            if (arrMax < elem) arrMax = elem;
        }
        System.out.println(arrMax);
    }
}
