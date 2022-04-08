package src._04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen maksimum 3 basamaklı bir tam sayi giriniz:");
        int sayi = scan.nextInt();
        if (sayi >= 1000 || sayi <= -1000)
            System.out.println("Girdiğiniz sayı dört basamaklı ya da daha büyük bir sayıdır.");
        else {
            if (sayi <= 0 && sayi >= -1000) {
                int birlerbasamagi = (-1 * sayi) % 10;
                int onlarbasamagi = ((-1 * sayi) / 10) % 10;
                int yuzlerbasamagi = ((-1 * sayi) / 100) % 10;
                System.out.print("Eksi ");
                switch (yuzlerbasamagi) {
                    default:
                        break;
                    case 1:
                        System.out.print("Yüz ");
                        break;
                    case 2:
                        System.out.print("İki Yüz ");
                        break;
                    case 3:
                        System.out.print("Üç Yüz ");
                        break;
                    case 4:
                        System.out.print("Dört Yüz ");
                        break;
                    case 5:
                        System.out.print("Beş Yüz ");
                        break;
                    case 6:
                        System.out.print("Altı Yüz ");
                        break;
                    case 7:
                        System.out.print("Yedi Yüz ");
                        break;
                    case 8:
                        System.out.print("Sekiz Yüz ");
                        break;
                    case 9:
                        System.out.print("Dokuz Yüz ");
                        break;
                }
                switch (onlarbasamagi) {
                    default:
                        break;
                    case 1:
                        System.out.print("On ");
                        break;
                    case 2:
                        System.out.print("Yirmi ");
                        break;
                    case 3:
                        System.out.print("Otuz ");
                        break;
                    case 4:
                        System.out.print("Kırk ");
                        break;
                    case 5:
                        System.out.print("Elli ");
                        break;
                    case 6:
                        System.out.print("Altmış ");
                        break;
                    case 7:
                        System.out.print("Yetmiş ");
                        break;
                    case 8:
                        System.out.print("Seksen ");
                        break;
                    case 9:
                        System.out.print("Doksan ");
                        break;
                }
                switch (birlerbasamagi) {
                    default:
                        break;
                    case 1:
                        System.out.print("Bir");
                        break;
                    case 2:
                        System.out.print("İki");
                        break;
                    case 3:
                        System.out.print("Üç");
                        break;
                    case 4:
                        System.out.print("Dört");
                        break;
                    case 5:
                        System.out.print("Beş");
                        break;
                    case 6:
                        System.out.print("Altı");
                        break;
                    case 7:
                        System.out.print("Yedi");
                        break;
                    case 8:
                        System.out.print("Sekiz");
                        break;
                    case 9:
                        System.out.print("Dokuz");
                        break;
                }
            } else {
                int birlerbasamagi = sayi % 10;
                int onlarbasamagi = (sayi / 10) % 10;
                int yuzlerbasamagi = (sayi / 100) % 10;
                switch (yuzlerbasamagi) {
                    default:
                        break;
                    case 1:
                        System.out.print("Yüz ");
                        break;
                    case 2:
                        System.out.print("İki Yüz ");
                        break;
                    case 3:
                        System.out.print("Üç Yüz ");
                        break;
                    case 4:
                        System.out.print("Dört Yüz ");
                        break;
                    case 5:
                        System.out.print("Beş Yüz ");
                        break;
                    case 6:
                        System.out.print("Altı Yüz ");
                        break;
                    case 7:
                        System.out.print("Yedi Yüz ");
                        break;
                    case 8:
                        System.out.print("Sekiz Yüz ");
                        break;
                    case 9:
                        System.out.print("Dokuz Yüz ");
                        break;
                }
                switch (onlarbasamagi) {
                    default:
                        break;
                    case 1:
                        System.out.print("On ");
                        break;
                    case 2:
                        System.out.print("Yirmi ");
                        break;
                    case 3:
                        System.out.print("Otuz ");
                        break;
                    case 4:
                        System.out.print("Kırk ");
                        break;
                    case 5:
                        System.out.print("Elli ");
                        break;
                    case 6:
                        System.out.print("Altmış ");
                        break;
                    case 7:
                        System.out.print("Yetmiş ");
                        break;
                    case 8:
                        System.out.print("Seksen ");
                        break;
                    case 9:
                        System.out.print("Doksan ");
                        break;
                }
                switch (birlerbasamagi) {
                    default:
                        break;
                    case 1:
                        System.out.print("Bir");
                        break;
                    case 2:
                        System.out.print("İki");
                        break;
                    case 3:
                        System.out.print("Üç");
                        break;
                    case 4:
                        System.out.print("Dört");
                        break;
                    case 5:
                        System.out.print("Beş");
                        break;
                    case 6:
                        System.out.print("Altı");
                        break;
                    case 7:
                        System.out.print("Yedi");
                        break;
                    case 8:
                        System.out.print("Sekiz");
                        break;
                    case 9:
                        System.out.print("Dokuz");
                        break;
                }
            }


        }

    }
}
