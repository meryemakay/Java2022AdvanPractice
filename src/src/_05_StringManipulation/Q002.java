package src._05_StringManipulation;

import java.util.Scanner;

public class Q002 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
  Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ısım ve soyısım gırınız");
        String isimSoyısım=scan.nextLine();

        int indexofspace= isimSoyısım.indexOf(" ");
        String isim= isimSoyısım.substring(0,indexofspace);
        String soyisim= isimSoyısım.substring(indexofspace+1);
        System.out.println("İsim:"+isim);
        System.out.println("Soyisim:"+soyisim);


    }
}
