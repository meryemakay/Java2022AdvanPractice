package src._04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // kullanıcının yasadıgı gune gore 100 gun sonra hangı gun oldu yazdırınız
        // pazartesi hafta baslangıcı

        Scanner scan = new Scanner(System.in);
        System.out.println("pazartesı :1\n Salı:2\n Carasamba :3\n persmbe:4\n cuma:5 \n cumartesı :6\n pazar :7\n haftasnın kacıncı gununde old gırınız");
        int kacıncıgun = scan.nextInt();



     if(kacıncıgun<=0 || kacıncıgun>7 ) {
         System.out.println("hatalı gırıs");


     }else
         System.out.println("kac gun sonrasını ogrnemk ıstıyorsunuz");
        int kacgunSonrası = scan.nextInt();
        int bulunanGun = (kacgunSonrası + kacıncıgun) % 7;
         switch (bulunanGun) {
             case 1:
                 System.out.println(kacgunSonrası + "gun sonra gunlerden PAZARTESI");
                 break;
             case 2:
                 System.out.println(kacgunSonrası + "gun sonra gunlerden SALI");
                 break;

             case 3:
                 System.out.println(kacgunSonrası + "gun sonra gunlerden CARSAMBA");
                 break;
             case 4:
                 System.out.println(kacgunSonrası + "gun sonra gunlerden PERSEMBE");
                 break;

             case 5:
                 System.out.println(kacgunSonrası + "gun sonra gunlerden CUMA");
                 break;

             case 6:
                 System.out.println(kacgunSonrası + "gun sonra gunlerden CUMARTESI");
                 break;
             case 0:
                 System.out.println(kacgunSonrası + "gun sonra gunlerden PAZAR");
                 break;
             default:
                 System.out.println("hafta 7 gundur");

         }

    }
}