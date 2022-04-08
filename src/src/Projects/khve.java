package src.Projects;

import java.util.Scanner;

public class khve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz\nTürk Kahvesi :\nFiltre Kahve :\nEspresso :");
        String hangiKahve = scanner.nextLine().toUpperCase();

        switch (hangiKahve) {

            case "TÜRK KAHVESİ":
                System.out.println("Türk Kahvesi hazirlaniyor...");
                System.out.println("Süt eklemek ister misiziniz (Evet veya Hayir olarak cevaplayiniz)");
                String sut = scanner.nextLine().toUpperCase();
                if (sut.equalsIgnoreCase("EVET")) {
                    System.out.println("Süt ekleniyor");
                } else if (sut.equalsIgnoreCase("HAYIR")) {
                    System.out.println("Süt eklennmiyor");
                }
                System.out.println("Seker eklemek ister misiziniz (Evet veya Hayir olarak cevaplayiniz)");
                String seker = scanner.nextLine().toUpperCase();
                if (seker.equalsIgnoreCase("EVET")) {
                    System.out.println("Kac seker ekemek istesini)");
                    int sekerSayisi = scanner.nextInt();
                    System.out.println("Seker ekleniyor");
                }
                if (seker.equalsIgnoreCase("HAYIR")) {
                    System.out.println("Süt eklennmiyor");
                }
                String bosKod = scanner.nextLine();
                System.out.println("Kahvenizi hangi boyda istesiniz,(Büyük boy - orta boy - küçük boy olarak giriniz.) ");
                String boyut = scanner.nextLine().toUpperCase();
                if (boyut.equalsIgnoreCase("BUYUK")) {
                    System.out.println("Kahveniz " + boyut + " boy hazilaniyor");
                } else if (boyut.equalsIgnoreCase("ORTA")) {
                    System.out.println("Kahveniz " + boyut + " boy hazilaniyor");
                } else if (boyut.equalsIgnoreCase("KUCUK")) {
                    System.out.println("Kahveniz " + boyut + " boy hazilaniyor");
                }
                System.out.println(hangiKahve + " " + boyut + " boy hazirdir");
                break;
            case "FİLTE KAHVE":
                System.out.println("Filtre Kahve hazirlaniyor...");
                System.out.println("Süt eklemek ister misiziniz (Evet veya Hayir olarak cevaplayiniz)");
                sut = scanner.nextLine().toUpperCase();
                if (sut.equalsIgnoreCase("EVET")) {
                    System.out.println("Süt ekleniyor");
                } else if (sut.equalsIgnoreCase("HAYIR")) {
                    System.out.println("Süt eklennmiyor");
                }
                System.out.println("Seker eklemek ister misiziniz (Evet veya Hayir olarak cevaplayiniz)");
                seker = scanner.nextLine().toUpperCase();
                if (seker.equalsIgnoreCase("EVET")) {
                    System.out.println("Kac seker ekemek istesini)");
                    int sekerSayisi = scanner.nextInt();
                    System.out.println("Seker ekleniyor");
                }
                if (seker.equalsIgnoreCase("HAYIR")) {
                    System.out.println("Süt eklennmiyor");
                }
                bosKod = scanner.nextLine();
                System.out.println("Kahvenizi hangi boyda istesiniz,(Büyük boy - orta boy - küçük boy olarak giriniz.) ");
                boyut = scanner.nextLine().toUpperCase();
                if (boyut.equalsIgnoreCase("BUYUK")) {
                    System.out.println("Kahveniz " + boyut + " boy hazilaniyor");
                } else if (boyut.equalsIgnoreCase("ORTA")) {
                    System.out.println("Kahveniz " + boyut + " boy hazilaniyor");
                } else if (boyut.equalsIgnoreCase("KUCUK")) {
                    System.out.println("Kahveniz " + boyut + " boy hazilaniyor");
                }
                System.out.println(hangiKahve + " " + boyut + " boy hazirdir");
                break;
            case "ESPRESSO":
                System.out.println("Espresso hazirlaniyor...");
                System.out.println("Süt eklemek ister misiziniz (Evet veya Hayir olarak cevaplayiniz)");
                sut = scanner.nextLine().toUpperCase();
                if (sut.equalsIgnoreCase("EVET")) {
                    System.out.println("Süt ekleniyor");
                } else if (sut.equalsIgnoreCase("HAYIR")) {
                    System.out.println("Süt eklennmiyor");
                }
                System.out.println("Seker eklemek ister misiziniz (Evet veya Hayir olarak cevaplayiniz)");
                seker = scanner.nextLine().toUpperCase();
                if (seker.equalsIgnoreCase("EVET")) {
                    System.out.println("Kac seker ekemek istesini)");
                    int sekerSayisi = scanner.nextInt();
                    System.out.println("Seker ekleniyor");
                }
                if (seker.equalsIgnoreCase("HAYIR")) {
                    System.out.println("Süt eklennmiyor");
                }
                bosKod = scanner.nextLine();
                System.out.println("Kahvenizi hangi boyda istesiniz,(Büyük boy - orta boy - küçük boy olarak giriniz.) ");
                boyut = scanner.nextLine().toUpperCase();
                if (boyut.equalsIgnoreCase("BUYUK")) {
                    System.out.println("Kahveniz " + boyut + " boy hazilaniyor");
                } else if (boyut.equalsIgnoreCase("ORTA")) {
                    System.out.println("Kahveniz " + boyut + " boy hazilaniyor");
                } else if (boyut.equalsIgnoreCase("KUCUK")) {
                    System.out.println("Kahveniz " + boyut + " boy hazilaniyor");
                }
                System.out.println(hangiKahve + " " + boyut + " boy hazirdir");
                break;
            default:


        }



    }
}
