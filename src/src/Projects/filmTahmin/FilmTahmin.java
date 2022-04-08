package src.Projects.filmTahmin;

import java.util.*;

public class FilmTahmin {
    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

     */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //  Scanner scan = new Scanner(System.in);

        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

        System.out.print("1-" + (filmler.size()) + " arasinda bir sayi giriniz : ");
        int secilenFilmIndex = scan.nextInt();
        filmGetir(filmler, secilenFilmIndex - 1);


    }

    private static void filmGetir(List<String> film, int index) {
        //   Scanner scan = new Scanner(System.in);
        StringBuilder tahminEdilecekFilm = new StringBuilder(FilmTahmin.filmler.get(index).replaceAll("\\w", "-"));//tum harf karakterleri - ile değiştir
        System.out.println(tahminEdilecekFilm);
        System.out.println(film.get(index).length() + " harfli yabanci film seçtiniz. Filmi tahmin etmek için " + 2 * film.get(index).length() + " hakkınız var .");

        char harf = ' ';
        int tahminSayısı = 0;
        int dogruTahminSayısı = 0;
        String str = "";

        do {

            System.out.print("yanlıs tahmin sayisi: " + (tahminSayısı - dogruTahminSayısı) + "/" + 2 * film.get(index).length() + "\ntahmin ettiginiz harfi giriniz : ");//yanlıs girilen tahmin sayisini print edildi
            harf = scan.next().toUpperCase().charAt(0);//film için tahmin edilen harf alındı
            str += harf;//harf str'ye atandı
            if (!tahminEdilecekFilm.toString().contains(str)) {//tahminEdilecekFilm'de kullanıcıdan alınan harf yoksa tahmin sayısı artılıdı
                tahminSayısı++;
            } //else {//tahminEdilecekFilm'de kullanıcıdan alınan harf varsa tekrar uyarısı verildi
            //     System.out.println(str + " harf zaten acıldı");
            // }
            for (int i = 0; i < tahminEdilecekFilm.length(); i++) {
                if (film.get(index).charAt(i) == harf) {//tahmin listeki edilen harf filmde varsa
                    if (!tahminEdilecekFilm.toString().contains(film.get(index).substring(i, i + 1))) {
                        //tahmin edien harf listteki filmde var ama tahminedilecek (---)filmde yoksa doğru tahmin ettin
                        dogruTahminSayısı++;
                    }
                    tahminEdilecekFilm.setCharAt(i, harf);//dogru tahmin edilen harf tahmineilcekfilme indexe göre atandı

                }

            }
            if (tahminEdilecekFilm.toString().equalsIgnoreCase(film.get(index))) {
                System.out.println("tebrikler kazndınız");
                System.out.println("tahmin ettiğiniz film : " + tahminEdilecekFilm);
                break;
            }
            System.out.println(tahminEdilecekFilm);

        } while ((tahminSayısı - dogruTahminSayısı) != 2 * film.get(index).length());//yanlış sayısı verilen hakka ulaşana kadar do body calışır

        if ((tahminSayısı - dogruTahminSayısı) == 2 * film.get(index).length()) {
            System.out.println("yanlıs tahmin sayısı : " + (tahminSayısı - dogruTahminSayısı));
            System.out.println("agam game over yine bekleriz....tahmin edemedigin film : " + film.get(index));
        }
    }
}



















/*
		/* 2.cozum*/
/*Scanner scan = new Scanner(System.in);

        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

        System.out.println("1-" + (film.size()) + " arasinda bir sayi giriniz");
        int secim = scan.nextInt();
        int sayac = 0;
        int dogruTahminSayisi = 0;
        int yanlisTahminSayisi = 0;


        switch (secim) {
            case 1:
                System.out.println("selctiginiz filmin harf sayisi : " + film.get(0).length());
                System.out.println((film.get(0).length() * 2) + " tahmin hakkınız bulunmkatadır");
                while (sayac < film.get(0).length() * 2) {
                    System.out.println("lütfen bir tahmin ettiginiz harfi giriniz");
                    String tahmin= scan.next();
                    sayac++;
                    System.out.println((film.get(0).length() * 2) - (sayac) + " tahmin hakkiniz kaldı");
                    if (film.get(0).toUpperCase().contains(tahmin)) {
                        dogruTahminSayisi++;
                        System.out.println("dogru tahmin sayisi : " + dogruTahminSayisi);
                        if (dogruTahminSayisi == film.get(0).length()) {
                            System.out.println("kazandiniz filmin adi : " + film.get(0));
                        }

                    } else {
                        yanlisTahminSayisi++;
                        System.out.println("yanlis tahmin sayisi : " + yanlisTahminSayisi);
                        if (yanlisTahminSayisi >= ((film.get(0).length() * 2))) {
                            System.out.println("tahmin hakkiniiz bitti kaybettiniz filmin adi : " + film.get(0));
                        }
                    }
                }
                break;
            case 2:
                System.out.println("selctiginiz filmin harf sayisi : " + film.get(1).length());
                System.out.println((film.get(1).length() * 2) + " tahmin hakkınız bulunmkatadır");
                while (sayac < film.get(1).length() * 2) {
                    System.out.println("lütfen bir tahmin ettiginiz harfi giriniz");
                    String tahmin= scan.next();
                    sayac++;
                    System.out.println((film.get(1).length() * 2) - (sayac) + " tahmin hakkiniz kaldı");
                    if (film.get(1).toUpperCase().contains(tahmin)) {
                        dogruTahminSayisi++;
                        System.out.println("dogru tahmin sayisi : " + dogruTahminSayisi);
                        if (dogruTahminSayisi == film.get(1).length()) {
                            System.out.println("kazandiniz filmin adi : " + film.get(1));
                        }

                    } else {
                        yanlisTahminSayisi++;
                        System.out.println("yanlis tahmin sayisi : " + yanlisTahminSayisi);
                        if (yanlisTahminSayisi >= ((film.get(1).length() * 2))) {
                            System.out.println("tahmin hakkiniiz bitti kaybettiniz filmin adi : " + film.get(1));
                        }
                    }
                }
                break;
            case 3:
                System.out.println("selctiginiz filmin harf sayisi : " + film.get(2).length());
                System.out.println((film.get(2).length() * 2) + "tahmin hakkınız bulunmkatadır");
                while (sayac < film.get(2).length() * 2) {
                    System.out.println("lütfen bir tahmin ettiginiz harfi giriniz");
                    String tahmin= scan.next();
                    sayac++;
                    System.out.println((film.get(2).length() * 2) - (sayac) + " tahmin hakkiniz kaldı");
                    if (film.get(1).toUpperCase().contains(tahmin)) {
                        dogruTahminSayisi++;
                        System.out.println("dogru tahmin sayisi : " + dogruTahminSayisi);
                        if (dogruTahminSayisi == film.get(2).length()) {
                            System.out.println("kazandiniz filmin adi : " + film.get(2));
                        }

                    } else {
                        yanlisTahminSayisi++;
                        System.out.println("yanlis tahmin sayisi : " + yanlisTahminSayisi);
                        if (yanlisTahminSayisi >= ((film.get(2).length() * 2))) {
                            System.out.println("tahmin hakkiniiz bitti kaybettiniz filmin adi : " + film.get(2));
                        }
                    }
                }
                break;
            case 4:
                System.out.println("selctiginiz filmin harf sayisi : " + film.get(3).length());
                System.out.println((film.get(3).length() * 2) + "tahmin hakkınız bulunmkatadır");
                while (sayac < film.get(3).length() * 2) {
                    System.out.println("lütfen bir tahmin ettiginiz harfi giriniz");
                    String tahmin= scan.next();
                    sayac++;
                    System.out.println((film.get(3).length() * 2) - (sayac) + " tahmin hakkiniz kaldı");
                    if (film.get(3).toUpperCase().contains(tahmin)) {
                        dogruTahminSayisi++;
                        System.out.println("dogru tahmin sayisi : " + dogruTahminSayisi);
                        if (dogruTahminSayisi == film.get(3).length()) {
                            System.out.println("kazandiniz filmin adi : " + film.get(3));
                        }

                    } else {
                        yanlisTahminSayisi++;
                        System.out.println("yanlis tahmin sayisi : " + yanlisTahminSayisi);
                        if (yanlisTahminSayisi >= ((film.get(3).length() * 2))) {
                            System.out.println("tahmin hakkiniiz bitti kaybettiniz filmin adi : " + film.get(3));
                        }
                    }
                }
                break;
            case 5:
                System.out.println("selctiginiz filmin harf sayisi : " + film.get(4).length());
                System.out.println((film.get(4).length() * 2) + "tahmin hakkınız bulunmkatadır");
                while (sayac < film.get(4).length() * 2) {
                    System.out.println("lütfen bir tahmin ettiginiz harfi giriniz");
                    String tahmin= scan.next();
                    sayac++;
                    System.out.println((film.get(4).length() * 2) - (sayac) + " tahmin hakkiniz kaldı");
                    if (film.get(4).toUpperCase().contains(tahmin)) {
                        dogruTahminSayisi++;
                        System.out.println("dogru tahmin sayisi : " + dogruTahminSayisi);
                        if (dogruTahminSayisi == film.get(4).length()) {
                            System.out.println("kazandiniz filmin adi : " + film.get(4));
                        }

                    } else {
                        yanlisTahminSayisi++;
                        System.out.println("yanlis tahmin sayisi : " + yanlisTahminSayisi);
                        if (yanlisTahminSayisi >= ((film.get(4).length() * 2))) {
                            System.out.println("tahmin hakkiniiz bitti kaybettiniz filmin adi : " + film.get(4));
                        }
                    }
                }
                break;
            case 6:
                System.out.println("selctiginiz filmin harf sayisi : " + film.get(5).length());
                System.out.println((film.get(5).length() * 2) + "tahmin hakkınız bulunmkatadır");
                while (sayac < film.get(5).length() * 2) {
                    System.out.println("lütfen bir tahmin ettiginiz harfi giriniz");
                    String tahmin= scan.next();
                    sayac++;
                    System.out.println((film.get(5).length() * 2) - (sayac) + " tahmin hakkiniz kaldı");
                    if (film.get(5).toUpperCase().contains(tahmin)) {
                        dogruTahminSayisi++;
                        System.out.println("dogru tahmin sayisi : " + dogruTahminSayisi);
                        if (dogruTahminSayisi == film.get(5).length()) {
                            System.out.println("kazandiniz filmin adi : " + film.get(1));
                        }
                    } else {
                        yanlisTahminSayisi++;
                        System.out.println("yanlis tahmin sayisi : " + yanlisTahminSayisi);
                        if (yanlisTahminSayisi >= ((film.get(5).length() * 2))) {
                            System.out.println("tahmin hakkiniiz bitti kaybettiniz filmin adi : " + film.get(5));
                        }
                    }
                }
                break;
            case 7:
                System.out.println("selctiginiz filmin harf sayisi : " + film.get(6).length());
                System.out.println((film.get(6).length() * 2) + "tahmin hakkınız bulunmkatadır");
                while (sayac < film.get(6).length() * 2) {
                    System.out.println("lütfen bir tahmin ettiginiz harfi giriniz");
                    String tahmin= scan.next();
                    sayac++;
                    System.out.println((film.get(6).length() * 2) - (sayac) + " tahmin hakkiniz kaldı");
                    if (film.get(6).toUpperCase().contains(tahmin)) {
                        dogruTahminSayisi++;
                        System.out.println("dogru tahmin sayisi : " + dogruTahminSayisi);
                        if (dogruTahminSayisi == film.get(6).length()) {
                            System.out.println("kazandiniz filmin adi : " + film.get(6));
                        }

                    } else {
                        yanlisTahminSayisi++;
                        System.out.println("yanlis tahmin sayisi : " + yanlisTahminSayisi);
                        if (yanlisTahminSayisi >= ((film.get(6).length() * 2))) {
                            System.out.println("tahmin hakkiniiz bitti kaybettiniz filmin adi : " + film.get(6));
                        }
                    }
                }
                break;
            case 8:
                System.out.println("selctiginiz filmin harf sayisi : " + film.get(7).length());
                System.out.println((film.get(7).length() * 2) + "tahmin hakkınız bulunmkatadır");
                while (sayac < film.get(7).length() * 2) {
                    System.out.println("lütfen bir tahmin ettiginiz harfi giriniz");
                    String tahmin= scan.next();
                    sayac++;
                    System.out.println((film.get(7).length() * 2) - (sayac) + " tahmin hakkiniz kaldı");
                    if (film.get(7).toUpperCase().contains(tahmin)) {
                        dogruTahminSayisi++;
                        System.out.println("dogru tahmin sayisi : " + dogruTahminSayisi);
                        if (dogruTahminSayisi == film.get(7).length()) {
                            System.out.println("kazandiniz filmin adi : " + film.get(7));
                        }

                    } else {
                        yanlisTahminSayisi++;
                        System.out.println("yanlis tahmin sayisi : " + yanlisTahminSayisi);
                        if (yanlisTahminSayisi >= ((film.get(7).length() * 2))) {
                            System.out.println("tahmin hakkiniiz bitti kaybettiniz filmin adi : " + film.get(7));
                        }
                    }
                }
                break;
            default:
                System.out.println(" hatali giris ");
        }

*/

















