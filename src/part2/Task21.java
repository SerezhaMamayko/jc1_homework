package part2;

public class Task21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 99, 4, 5, 9, 9, 6};
        int arrIndex = 0;
        int arrMax = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arrMax <= arr[i]){
                arrMax = arr[i];
                arrIndex = i;

            }
        }
        System.out.println(arrIndex);
    }
}
