package src._09_Arrays;

public class Q05 {

    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
        int array[]= {1,2,3,4,5,6,7};
        int arrayToplam=0;
        int arrayOrtalama=0;

        for (int i=0; i<array.length; i++) {
            arrayToplam+=array[i];

        }
arrayOrtalama=arrayToplam/array.length;
        for (int i=0; i<array.length; i++){
            if (array[i]>arrayOrtalama){
                System.out.println(array[i]);
            }
        }
    }

}


