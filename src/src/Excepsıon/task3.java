package src.Excepsıon;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {


        randomSayi();

    }

    private static void randomSayi() {
        Random rnd = new Random();
        int toplam = 0;
        while (true) {
            int sayi1 = rnd.nextInt(10);
            int sayi2 = rnd.nextInt(10);
            try {
                toplam = sayi1 + sayi2;
                if (toplam < 12)
                    throw new Exception();
                else {
                    System.out.println("sayi1 : " + sayi1 + " sayi2 : " + sayi2) ;
                    System.out.println("Toplam : " + toplam);
                    break;
                }
            } catch (Exception e) {
                System.out.println("sayi1 : " + sayi1 + " sayi2 : " + sayi2) ;
                System.out.println("Toplam 12'den küçük olamaz. ");




            }
        }
    }
}


