package src._10_List;

import java.util.ArrayList;

public class Q10 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        System.out.println(ardisikTopla(arr));

    }

    private static ArrayList<Integer> ardisikTopla(int[] arr) {
        ArrayList<Integer> toplananSayilarList = new ArrayList<>();
        int count = 0; //for kac kere calısmasartı o kadar eleamnı getırır
        int toplananSayiAdedi = 1;// arr den baslangıcta 1 eleman toplamaya gırecek
        while (arr.length - toplananSayiAdedi >= count) {//sayılar bitene kadar arr den elemnları artırarak getır topla ve her toplamı da lıste ekle
            int toplam = 0;
            for (int i = 0; i <= count; i++) { // arr den dongu sayısı kadar eleman getırıp top eklıyor
                toplam += arr[toplananSayiAdedi - 1 + i];
            }
            count++;
            toplananSayiAdedi += count;//her whılw dongude toplanacak arr elemanı sayııs artırılıyor
            toplananSayilarList.add(toplam);//her whıle donguden elde edılen toplm lıste elemen olrk eklnıyor
        }
        return toplananSayilarList;
    }
}



