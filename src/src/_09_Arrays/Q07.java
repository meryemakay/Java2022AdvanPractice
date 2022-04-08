package src._09_Arrays;

import java.util.Arrays;



public class Q07 {

    public static void main(String[] args) {
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80
         */

/* çözümüm ***
int arr[][]={{1,2,-3},{41,55},{-61,-17,80}};

        System.out.println(Arrays.deepToString(arr));

        int max=arr[0][0];

        for (int i=0; i<arr.length; i++) {
            for (int j=0;j<arr[i].length; j++){
                if (arr[i][j]>max){
             max=arr[i][j]  ;
                }
            }
        }
        System.out.println(max); */

        int arr[][]={{1,2,-3},{41,55},{-61,-17,80}};

        System.out.println("gırdıgınız arr nın max elemanı " + maxDegerBul(arr));


    }


    public static int maxDegerBul(int arr[][]){
        int max=arr[0][0]; //methoddan return edılecek max elemanun atanacagı cont creatae edıldı

        for (int i=0; i<arr.length; i++){ //kat kontrolu yapıldı
            for (int j=0; j<arr[i].length;j++){ //daıre kontrolu yapıldı
               if(arr[i][j]>max){
                   max=arr[i][j];
               }


            }
        }
return max;

    }
}

