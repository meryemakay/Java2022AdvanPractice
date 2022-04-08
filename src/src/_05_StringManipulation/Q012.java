package src._05_StringManipulation;

import java.util.Scanner;

public class Q012 {
    public static void main(String[] args) {
		/* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir e-mail adresi giriniz:");
        String email = scanner.nextLine();
        if (email.contains(" ") || !email.contains("@"))
            System.out.println("Lütfen geçerli bir e-mail adresi giriniz");
        else {
            int index1 = email.indexOf("@");
            if (email.substring(index1).contains("gmail.com")) {
                System.out.println("e-mail onaylandi");
            } else {
                System.out.println("Lütfen gmail hesabinizi giriniz.");
            }
        }
    }

}
