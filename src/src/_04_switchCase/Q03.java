package src._04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen bır ay numarası gırınız");
        int ayNo = scan.nextInt();



        //ocak 31, subat 28, mart 31, nısan 30, mayıs 31,
        // hazıran 30, temmuz 31, agustos 31 eylul 30
        // ekım 31, kasım 30, aralık 31

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println( "gırdıgnız ayda: 31 gundur");break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("grdıgınız ayda: 30 gundur");break;

            case 2:
                System.out.println("lutfen bulundugunuz yılı gırınız");
                int yıl=scan.nextInt();
                if(yıl%4==0){
                    System.out.println("gırdıgınız ayda 29 gun vardır");
                }else
                    System.out.println("gırdıgınız ayda 28 gun vardır");break;

            default:
                System.out.println("hatalı gırıs yapıldı");


        }
    }
}

