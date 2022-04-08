package src.tasks;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir int deger giriniz");
        int num=scan.nextInt();
        isPowNum(num);
        System.out.println(isPowNum(num));
    }
    public static boolean isPowNum(int num) {
        while(num>2) {
            num/=2;
        }
        if(num==2) {
            return true;
        }else {
            return false;
        }
    }




}


