package src._09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

	/* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.

	 */
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("kac elemanlı array istedıgınızı yazınız");
int arrElemanSayısı= scan.nextInt();


int[] array = new int[arrElemanSayısı];

for (int i=0; i<array.length; i++){
	System.out.println(i+1 + ".elemanı yazınız");

	array[i]=scan.nextInt();


}

Arrays.sort((array));
int fark =array[array.length-1]-array[0];
		System.out.println("en buyuk ve en kucuk eleman farkı:"+ fark);
	}

}
