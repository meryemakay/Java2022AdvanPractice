package src._05_StringManipulation;

import java.util.Scanner;

public class Q01_o {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir String ifade giriniz.");
        String yazi=scan.nextLine();
        if (yazi.contains(" ")) System.out.println("İfade boşluk karakterini içermektedir.");
        else System.out.println("İfade boşluk karakterini içermemektedir.");
    }
}

