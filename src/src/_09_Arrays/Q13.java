package src._09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */
/*cözümüm
        int arr[] = new int[8];
        Scanner scan = new Scanner(System.in);

        System.out.println("arr nın elemanlarını gırınız");

        for (int i = 0; i < arr.length; i++) {
arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));
   int sayac=0;


   for(int i = 0; i < arr.length; i++) {
       if (arr[i]%3==0){
           sayac++;

       }
   }

        System.out.println("arr de " + sayac +" tane 3 e bolunen sayı vardır");
        */

        int arr[] = new int[8]; //8 elemnlı bos ınt type array create edıldı
        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) { //array ın 8 elemanı alındı
            System.out.print(i + ".index elemanı gırınz:");
            arr[i] = scan.nextInt();
            if (arr[i] % 3 == 0) {
                sayac++;
            }

        }
        System.out.println("3 e bolunen eleman sayısı :"+ sayac);
    }
}