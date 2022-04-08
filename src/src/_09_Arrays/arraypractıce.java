package src._09_Arrays;

import java.util.Arrays;

public class arraypractıce
{

    public static void main(String[] args) {
        //tum elemanlarıın carpımını ekrana yazdıran bır method yazınız
        int arr[][]={{1,2,3},{4,5,6}};
        int carpım=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpım*=arr[i][j];
            }
        }
        System.out.println("Sayıların carpımı: "+carpım);



        //Asagidaki multi dimensional array'in ic array'lerindeki tum elemanlarin toplamini
        //birer birer bulan ve herbir sonucu yeni bir array'in elemani yapan ve yeni array'i ekrana
        //yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
        //Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

        int[][] array = {{1, 2, 3}, {4, 5}, {6, 7}};

        int[] toplam = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                toplam[i] += array[i][j];
            }
        }
        System.out.println(Arrays.toString(toplam));




    }
}

