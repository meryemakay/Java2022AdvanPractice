package src._05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 4 harfli bir kelime giriniz:");
        String kelime=scan.nextLine();
        String harf1=kelime.substring(0,1);
        String harf2=kelime.substring(1,2);
        String harf3=kelime.substring(2,3);
        String harf4=kelime.substring(3);
        String ters=(harf4+harf3+harf2+harf1);
        System.out.println("Girilen kelimenin tersi:"+ters);



    }
}
