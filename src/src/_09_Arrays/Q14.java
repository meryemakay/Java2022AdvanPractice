package src._09_Arrays;

import java.util.Arrays;

public class Q14 {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

       */



        String str = "Congratulations";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        String temp1[] = new String[arr.length];
        String temp = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("o") || arr[i].equals("a") || arr[i].equals("u"))
                arr[i] = "i";
            temp+=arr[i];
        }
        System.out.println(temp);

    }

}
