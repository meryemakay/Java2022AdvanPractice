package src._05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = scanner.nextLine();

        int uzunluk = isim.length();
        if (uzunluk == 3) {
            String ilkHarf=isim.substring(0,1);
            String ikinciHarf = isim.substring(1,2);
            String ucuncuHarf = isim.substring(2);

            System.out.println(ilkHarf.contains(ikinciHarf)&&ikinciHarf.contains(ucuncuHarf)?"harflerin tamamı aynı":
                    ilkHarf.contains(ikinciHarf)? "ilkharf ikinci harf ile aynı":
                            ilkHarf.contains(ucuncuHarf)?"ilkharf ucuncu harf ile aynı":
                                    ikinciHarf.contains(ucuncuHarf)?"ikinci harf ücüncü harfle aynı":"harfler birbirinden farklı "+isim);

        }else {
            System.out.println("hatali giris");
        }

        char c1=isim.charAt(0);
        char c2=isim.charAt(1);
        char c3=isim.charAt(2);
    String    sonuc= isim.length()==3 ?((c1!=c2&&c1!=c3&&c2!=c3)?"gırdıgınız ısım 3 harflı ve unıg karaktere sahıp":
            "3 harflı ama unıg degıl"):"gırdıgınız ısım 3 harflı degıl";
        System.out.println(sonuc);
    }
}