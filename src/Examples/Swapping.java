package Examples;

import java.util.Arrays;

public class Swapping {

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 0, 1};
        int temp = 0;

        for(int i = 0; i< arr.length; i++){
            for(int j = i + 1; j< arr.length; j++){
                if (arr[j]< arr [i]){
                 temp = arr[j];
                 arr[j] = arr[i];
                 arr[i] = temp;

                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
