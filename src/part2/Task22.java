package part2;

import static java.lang.Math.min;
import static java.lang.Math.max;


public class Task22 {
    public static void main(String[] args) {
        int [] arr = {2, 10, 10, 4, 5, 6, 7, 8, 1, 1};
        int indexMin = 0; int arrMin = arr[0];
        int indexMax = 0; int arrMax = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arrMin == arr[i]) indexMin = min(indexMin,i);
            if (arrMin > arr[i]) {
                arrMin = arr[i];
                indexMin = i;
            }
            if (arrMax == arr[i]) indexMax = max(indexMax, i);
            if (arrMax < arr[i]){
                arrMax = arr[i];
                indexMax = i;
            }
        }
        indexMax--;
        indexMin++;
        int start = min (indexMin, indexMax);
        int end = max (indexMin, indexMax);
        for (int index = start; index <= end; index++){
            sum+=arr[index];
        }
        System.out.println(sum);
    }
}
