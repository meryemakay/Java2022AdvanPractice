package src._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
        97:a  122:z ascii değeri
         */

        Scanner scann=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz : ");
        char harf=scann.next().charAt(0);
        if (harf>='a' && harf<='z'){
            System.out.println("Kucuk harf");
        } else  if (harf>='A' && harf<='Z'){
            System.out.println("Buyuk harf");
        }else System.out.println("Girdiginiz karakter harf degildir");
    }
}



