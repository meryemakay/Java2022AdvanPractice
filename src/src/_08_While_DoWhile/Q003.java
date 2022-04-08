package src._08_While_DoWhile;

import java.util.Scanner;

public class Q003 {

    public static void main(String[] args) {
      /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27

        2  3 = 2*2*2=8

       */

Scanner scan = new Scanner(System.in);
        System.out.println("taban sayıyı gırınız");
        int sayı1=scan.nextInt();
        System.out.println("ust sayıyı gırınız");
        int sayı2=scan.nextInt();

        int sonucSayi=1;


        while(sayı2>0){
            sonucSayi*=sayı1;
            sayı2--;
        }
        System.out.println(sonucSayi);


    }


}
