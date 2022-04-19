package src.Excepsıon;

import java.util.Scanner;

public class tast1 {
    public static void main(String[] args) {




            Scanner scan = new Scanner(System.in);
            int vizeNotu = 0;
            int finalNotu = 0;

            while (true) {
                try {
                    System.out.print("Vize giriniz: ");
                    vizeNotu = scan.nextInt();
                    if (vizeNotu < 0 || vizeNotu > 100) {
                        throw new ArithmeticException();
                    } else break;
                } catch (ArithmeticException e) {
                    System.out.println("Not 0 ile 100 arasında olmalıdır");
                } catch (Exception e) {
                    String str = scan.next();
                    System.out.println("Hatalı giriş yaptınız.");
                }
            }

            while (true) {
                try {
                    System.out.print("Final giriniz: ");
                    finalNotu = scan.nextInt();
                    if (finalNotu < 0 || finalNotu > 100) {
                        throw new ArithmeticException();
                    } else break;
                }
                catch (ArithmeticException e) {
                    System.out.println("Not 0 ile 100 arasında olmalıdır");
                } catch (Exception e) {
                    String str = scan.next();
                    System.out.println("Hatalı giriş yaptınız.");
                }
            }

            ortalamaHesapla(vizeNotu, finalNotu);

        }

        private static void ortalamaHesapla(int vizeNotu, int finalNotu) {
            double ortalama = (vizeNotu*0.40 + finalNotu*0.60);
            System.out.println("Ortalama : " + ortalama);
            if (ortalama >= 70) System.out.println("BAŞARILI...");
            else System.out.println("BAŞARISIZ...");
        }
    }


