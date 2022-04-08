package src._05_StringManipulation;

import java.util.Scanner;

public class Q006 {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir e-posta adresi giriniz:");
        String eposta = scanner.nextLine();
        if (eposta.contains(" ") || !eposta.contains("@"))
            System.out.println("Lütfen geçerli bir e-posta adresi giriniz");
        else {
            if (eposta.contains("hotmail")) {
                eposta = eposta.replace("hotmail", "gmail");
                System.out.println(eposta);
            } else System.out.println(eposta);
        }

    }
}
