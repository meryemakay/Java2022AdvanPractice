package src._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
Scanner scan =new Scanner(System.in); //kullanıcdn ımput almk ıcın scanner objesı create ettık
		System.out.println("toplama için 1\n cıkarma için 2\n bölme için 3\n carpma için 4");
		//kullanıcıya secım ıcın işlem menusu yazdırdık



int islem=scan.nextInt(); //

		System.out.println("lutfen iki tam sayı gırınız : "); // kullanııcya bıldıırmde bulunuldu
		double num1=scan.nextDouble(); //1.sayı assıgn edıld
		double num2=scan.nextDouble(); //2.sayı assıgn edıld
		if (islem == 1) {
			System.out.println("toplama ıslemının sonucu :" +num1+ " + " +num2 +" = "+(num1+num2));


		}else if (islem==2){
			System.out.println("cıkarma işleminin sonucu : " +num1+ " - "+num2 +" = "+(num1-num2));
		}else if(islem==3) {
			System.out.println("bolme işleminin sonucu : " + num1 + " / " + num2 + " = " + (num1 / num2));
		}else if (islem==4) {
			System.out.println("carpma işleminin sonucu : " + num1 + " * " + num2 + " = " + (num1 * num2));

		}else System.out.println("hatalı secım yaptınız tekrar deneyınız");

		// \n alt satıra gecer



		}

	}

