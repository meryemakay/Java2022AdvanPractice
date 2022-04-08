package src._05_StringManipulation;

import java.util.Scanner;

public class Q009 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
        Scanner scan = new Scanner(System.in);
        System.out.print("Çift uzunlukta bir String giriniz:");
        String str=scan.nextLine();
        if (str.contains(" ")|| str.length()%2!=0) System.out.println("Hatali giris");
        else {
            int half=str.length()/2;
            System.out.println(str.substring(0,half));
        }

    }
}
