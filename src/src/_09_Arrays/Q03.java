package src._09_Arrays;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
int arr[] = {1,2,-3,4,-5,-6};
for (int i = 0; i < arr.length; i++) {
    arr[i] = 0-arr[i];
}
        System.out.println(Arrays.toString(arr));
    }


}
