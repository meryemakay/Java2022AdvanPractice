package src._06_Method_Creation;

import java.util.Scanner;

public class asalcarpan {
    static int bolen = 0;
    static boolean isAsal = false;

    public static void main(String[] args) {
        /* TASK :
         * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
         * METHOD create ediniz.
         *
         * Ör: Input : 50
         *     Bolenler : 2,5,10,25,50
         *     Asal Bolenler: 2,5
         *     En buyuk asal carpan: 5
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = scan.nextInt();//50
        asalCarpan(sayi);
    }

    private static void asalCarpan(int sayi) {
        int asalBolen=0;
        for (int i = 2; i <= sayi; i++) {
            if (sayi % i == 0) {
                bolen = i;
                asalMı(bolen);  //method coll bolen sayının asal olup olmadıgını kontrol edıyor


            }if(isAsal){
                asalBolen=bolen;
            }

        }
        System.out.println("gırdıgınız sayının en buyuk asala bolenı:" + asalBolen);

    }

    private static boolean asalMı(int bolen) {  //bu method gelen sayının asallıgına bakar
        for (int i = 2; i < bolen; i++) {
            if (bolen % i == 0) { //bolen sayısını bolen sayısına kadar tum tamsayılar boldugunde kalan 0 dgılse:
                // bu sayı kendısınden baska bır sayıya bolunmez
                isAsal =true;
                break;

            }else isAsal=false;
        }
        return isAsal;
    }
}


   