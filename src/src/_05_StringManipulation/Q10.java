package src._05_StringManipulation;

import java.util.Scanner;

public class Q10 {
            public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

                Scanner scan= new Scanner(System.in);
                System.out.print("Adınız:");
                String ad=scan.nextLine();
                System.out.print("Soyadınız:");
                String soyad=scan.nextLine();
                System.out.print("Kredi Kartı Numaranız:");
                String kkno=scan.nextLine();

                if (kkno.length()>16||kkno.length()<16) System.out.println("Lütfen geçerli bir Kredi Kartı Numarası yazın.");

        else {
                    String kkno2=kkno.substring(0,12).replaceAll("\\S","*");
                    String kkno3=kkno.substring(12);
                    String kkx=kkno2+kkno3;
                    String ad2=ad.substring(1).replaceAll("\\S","*");
                    String ad3=ad.substring(0,1);
                    String adx=ad3+ad2;
                    String soyad2=soyad.substring(1).replaceAll("\\S","*");
                    String soyad3=soyad.substring(0,1);
                    String soyadx=soyad3+soyad2;

                    System.out.println("Ad :"+adx+" Soyad :"+soyadx+" Kart No :"+kkx);

                }


            }
        }




