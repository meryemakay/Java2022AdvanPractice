package src._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q18_Practice {
    public static void main(String[] args) {


                double vizeNot, vizeYuzde, finNot, finYuzde, ortalama;
                Scanner scan = new Scanner(System.in);
                System.out.println("Vize sınav sonucunuzu giriniz :");
                vizeNot = scan.nextDouble();
                System.out.println("Vize sınavı yüzdesini giriniz");
                vizeYuzde = scan.nextDouble();
                double ort1 = (vizeNot * 0.40);
                System.out.println("Vize sinav yuzdeniz:" + ort1);
                System.out.println("Final sınav sonucunuzu giriniz");
                finNot = scan.nextDouble();
                System.out.println("Final sınavı yüzdesini giriniz");
                finYuzde = scan.nextDouble();
                double ort2 = (finNot * 0.60);
                System.out.println("Final sinav yuzdeniz:" + ort2);
                System.out.println("Not ortalamaniz:" + (ort1 + ort2));

                if ((ort1 + ort2) >= 90) {
                    System.out.println("AA");
                } else if ((ort1 + ort2) >= 80 & (ort1 + ort2) <= 89) {
                    System.out.println("BA");

                } else if ((ort1 + ort2) >= 70 & (ort1 + ort2) <= 79) {
                    System.out.println("BB");
                } else if ((ort1 + ort2) >= 60 & (ort1 + ort2) <= 69) {
                    System.out.println("CB");
                } else if ((ort1 + ort2) >= 50 & (ort1 + ort2) <= 59) {
                    System.out.println("CC");
                } else if ((ort1 + ort2) >= 40 & (ort1 + ort2) <= 49) {
                    System.out.println("DC");
                } else if ((ort1 + ort2) >= 30 & (ort1 + ort2) <= 39) {
                    System.out.println("DD");
                } else if ((ort1 + ort2) >= 0 & (ort1 + ort2) <= 29) {
                    System.out.println("FF");
                }


            }
        }

