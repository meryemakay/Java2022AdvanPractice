package src._05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("3 kelimeden oluşan bir isim giriniz:");
        String adsoyad=scan.nextLine();
        int indexofspace1=  adsoyad.indexOf(" ");
        int indexofspace2=  adsoyad.lastIndexOf(" ");
        char harf1= adsoyad.substring(0,indexofspace1).toUpperCase().charAt(0);
        char harf2= adsoyad.substring(indexofspace1+1).toUpperCase().charAt(0);
        char harf3= adsoyad.substring(indexofspace2+1).toUpperCase().charAt(0);
        System.out.println(adsoyad+"->"+harf1+"."+harf2+"."+harf3+".");

    }
}
