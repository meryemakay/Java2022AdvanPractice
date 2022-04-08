package src._09_Arrays;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
	
	/*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	
	*/

        int arr[] = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int Max=arr[arr.length-1];

        int ikincimax=arr[arr.length-2];

        int kücük=arr[0];

        System.out.println(kücük);

        System.out.println(Max);

        System.out.println(ikincimax);

    }
}
