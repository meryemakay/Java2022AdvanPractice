package src._10_List;

import java.util.Scanner;

public class QTasKagitMakas01 {

    public static void main(String[] args) {
/*
        /* TASK:
         tas >makas
         makas >kagit
         kagit >tas

	Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
	Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
	While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
	Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
	Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
	Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
	En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
	dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

	 */
/*
        Scanner scan = new Scanner(System.in);

        int kullanici_puani = 0;

        int bilgisayar_puani = 0;

        String dewamkeee = "EVET";

        int kullanıcıSecim = 0;

        int count = 1;

        while (dewamkeee.equalsIgnoreCase("EVET")) {

            if (count == 1) {

                System.out.println("\t\t    _______\r\n"
                        + "\t\t---'   ____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)\r\n"
                        + "\t\t\r\n"
                        + "    _______\r\n"
                        + "---'   ____)____\r\n"
                        + "          ______)\r\n"
                        + "          _______)\r\n"
                        + "         _______)\r\n"
                        + "---.__________)\r\n"
                        + "\r\n"
                        + "\t\t    _______\r\n"
                        + "\t\t---'   ____)____\r\n"
                        + "\t\t          ______)\r\n"
                        + "\t\t       __________)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)");

                System.out.println("================================================");

                System.out.println("Tas kagit makas oyununa hos geldiniz efendim :) ");

                System.out.println("================================================");

                System.out.println("1-Tas 2-Kagit 3-Makas");

                System.out.println("=====================");

            }

            System.out.println("Seciminiz : ");

            count = 0;

            kullanıcıSecim = scan.nextInt();

            int bilgisayarin_secimi = (int) (Math.random() * 3);

            if (kullanıcıSecim == 1) {

                if (bilgisayarin_secimi == 1) {

                    System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Berabere");

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                } else if (bilgisayarin_secimi == 2) {

                    System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Kaybettiniz");

                    bilgisayar_puani++;

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " +

                            bilgisayar_puani);

                } else {

                    System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Kazandiniz");

                    kullanici_puani++;

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                }

            } else if (kullanıcıSecim == 2) {

                if (bilgisayarin_secimi == 1) {

                    System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Kazandiniz");

                    kullanici_puani++;

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                } else if (bilgisayarin_secimi == 2) {

                    System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Berabere");

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                } else {

                    System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Kaybettiniz");

                    bilgisayar_puani++;

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                }

            } else if (kullanıcıSecim == 3) {

                if (bilgisayarin_secimi == 1) {

                    System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Kaybettiniz");

                    bilgisayar_puani++;

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                } else if (bilgisayarin_secimi == 2) {

                    System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Kazandiniz");

                    kullanici_puani++;

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                } else {

                    System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Berabere");

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                }

            } else {

                System.out.println("Hatali giris yaptiniz, lutfen tekrar deneyiniz");

                continue;

            }

            if (kullanici_puani == 3) {

                System.out.println("Oyunu " + kullanici_puani + "-" + bilgisayar_puani + " kazandiniz");

                System.out.println("=================================================================");

                System.out.println("░░░░░░░░░░░░░░░░░░░░░░█████████\r\n"
                        + "░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███\r\n"
                        + "░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███\r\n"
                        + "░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███\r\n"
                        + "░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██\r\n"
                        + "░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██\r\n"
                        + "██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██\r\n"
                        + "█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██\r\n"
                        + "██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█\r\n"
                        + "░░████████████░░░█████████████████");

                System.out.println("==============================================================");

                System.out.println("Oyun bitti, oyuna devam etmek istiyor musunuz : (EVET / HAYIR)");

                System.out.println("==============================================================");

                dewamkeee = scan.next();


                if (dewamkeee.equalsIgnoreCase("Evet")) {

                    kullanici_puani = 0;

                    bilgisayar_puani = 0;

                    count = 1;
                }

            } else if (bilgisayar_puani == 3) {

                System.out.println("Oyunu " + bilgisayar_puani + "-" + kullanici_puani + " kaybettiniz");

                System.out.println("==================================================================");

                System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀\r\n"
                        + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\r\n"
                        + "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\r\n"
                        + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\r\n"
                        + "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\r\n"
                        + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\r\n"
                        + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\r\n"
                        + "██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼\r\n"
                        + "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "\r\n"
                        + "");

                System.out.println("==============================================================");

                System.out.println("Oyun bitti, oyuna devam etmek istiyor musunuz : (EVET / HAYIR)");

                System.out.println("==============================================================");

                dewamkeee = scan.next();

                if (dewamkeee.equalsIgnoreCase("EVET")) {

                    kullanici_puani = 0;

                    bilgisayar_puani = 0;

                    count = 1;

                }

            }

        }
*/

     /*
         static Scanner scan = new Scanner(System.in);
    static boolean devamKarari=true;
    static int bilgisayarPuan = 0;
    static int oyuncuPuan = 0;

    public static void main(String[] args) {

        /* TASK:
         tas >makas
         makas >kagit
         kagit >tas

	Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
	Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
	While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
	Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
	Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
	Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
	En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
	dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

	 */
       /* while (bilgisayarPuan <= 5 && oyuncuPuan <= 5 && devamKarari==true ) {

            System.out.println("Lutfen Tas : 1 , Makas icin : 2 ve Kagit icin : 3 giriniz");
            int secim = scan.nextInt();
            int bilgisayarSecimi = ( (int) (Math.random()*3)+1);
            karsilatirma( secim, bilgisayarSecimi);

            devamKarari=oyunaDevammi();

        }
    }

    public static boolean oyunaDevammi() {
        boolean karar = true;
        System.out.println("Oyuna Devam etmek için 1, Oyunu sonlandırmak 2 giriniz");
        if (scan.nextInt() != 1) {
            karar = false;
            System.out.println("Nereye karpuz kesecektik");
        }
        return karar;
    }

    public static void karsilatirma(int secim,int bilgisayarSecimi){

        switch(secim){
            case 1:
                if (bilgisayarSecimi==2){
                    oyuncuPuan+=1;

                }else if (bilgisayarSecimi==3){
                    bilgisayarPuan+=1;
                }

                break;
            case 2:
                if (bilgisayarSecimi==1){
                    bilgisayarPuan+=1;

                }else if (bilgisayarSecimi==3){
                    oyuncuPuan+=1;
                }

                break;
            case 3:
                if (bilgisayarSecimi==1){
                    oyuncuPuan+=1;

                }else if (bilgisayarSecimi==2){
                    bilgisayarPuan+=1;
                }

                break;

            default:
                System.out.println("Lutfen dogru secim yapiniz \nBu seciminiz hesaplamada kullanılmayacaktır");

                break;

        }
        System.out.println("Bilgisayar secimi : "+bilgisayarSecimi);
        System.out.println("Oyuncu secimi : "+secim);
        System.out.println("Bilgisayar Puanı : "+bilgisayarPuan);
        System.out.println("Oyuncu Punanı : "+oyuncuPuan);

    }
}



    }*/

}





}


