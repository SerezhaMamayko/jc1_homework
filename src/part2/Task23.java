package part2;

public class Task23 {
    public static void main(String[] args) {
        int [] arr = {2, 10, 10, 4, 5, 6, 7, 8, 1, 1};
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        System.out.println();
        for (int elem : arr){
            System.out.print(elem + " ");
        }
    }
}
