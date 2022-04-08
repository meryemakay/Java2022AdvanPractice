package src._07_ForLoop;

public class Q03__ {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        int harfSayisi = 0;
        String str = "Bugun hava cok guzel";
        for (int i = 0; i <= str.indexOf('c'); i++) {
            if (str.charAt(i) == 'a') {
                harfSayisi++;
            }
        }
        System.out.println("\"" + str + "\"" + " string-inde \"c\" harfine kadar \"a\" harfi " + harfSayisi + " adet kullanildi.");
    }

    }

