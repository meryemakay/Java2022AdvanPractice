package src._12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

        //int sayi1 = 3;
        int sayi2 = 5;
        int sayi3 = 6;
        int sayi4 = 4;
        int sayi5 = 7;
        int carpılacakSayi = 5;
        topla(sayi2, sayi3, sayi4, sayi5);
    }

   /* private static void topla(int sayi1, int...toplanacaklar) {
        int toplam = 0;
        for (int each:toplanacaklar) {
            toplam+=each;

        }
        System.out.println("toplam :" +toplam);
        System.out.println("carpım :" + sayi1*toplam);*/


  /* 2.cozum
   private static void topla(int... toplanacakSayilar) {
        List<Integer> sayılar = new ArrayList<>();
        int toplam = 0;
        for (Integer each : toplanacakSayilar
        ) {
            sayılar.add(each);
        }

        for (int i = 1; i < sayılar.size(); i++) {
            toplam += sayılar.get(i);
            System.out.println(toplam);
        }

        toplam *= sayılar.get(0);
        System.out.println(toplam);*/


    public static void topla(int carpilacakSayi, int... toplanacakSayi) {


        int toplam = 0;
        for (int each : toplanacakSayi
        ) {
            toplam += each;

        }
        System.out.println(toplam);
        System.out.println(toplam * carpilacakSayi);
    }

}

