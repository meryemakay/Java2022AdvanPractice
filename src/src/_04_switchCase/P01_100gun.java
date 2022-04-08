package src._04_switchCase;

import java.util.Scanner;

public class P01_100gun {

    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta baslangıcı. 100%7=2 oldugundan +2 ekleyecegiz
        //statıc verı sabıt verı kullnılır 100 gun sonra
        //dınamık dınamık verı kullnılır kac gun sonra denırse . vrı degısırse dıye dınamık yazmak lzm


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen  haftanın gunune göre numara tuslayınız(1 den 7 ye)");
        int gun=scan.nextInt();
        if (gun==1){
            System.out.println("100 gun sonra gun= "+(gun+2)+" carsamba");
        }if (gun==2){
            System.out.println("100 gun sonra gun="+(gun+2)+" persembe");
        }if (gun==3){
            System.out.println("100 gun sonra gun="+(gun+2)+" cuma");
        }if (gun==4){
            System.out.println("100 gun sonra gun="+(gun+2)+" cumartesi");
        }if (gun==5){
            System.out.println("100 gun sonra gun="+(gun+2)+" pazar");
        }if (gun==6){
            System.out.println("100 gun sonra gun="+(gun+2)+" pazartesi");
        }if (gun==7){
            System.out.println("100 gun sonra gun="+(gun+2)+" salı");
        }


    }
}



