package src._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class boslık {
    public static void main(String[] args) {
        //kullanıcıdn alacagınız bır strıngın bosluk ıcerıp ıcermedıgını kontrol edınız

        Scanner scan=new Scanner(System.in);
        System.out.println("Strıng bır kelıme gırınız");

        String kelıme=scan.nextLine();

        if(!kelıme.contains(" ")){
            System.out.println("bosluk ıcermıyor");
        }else
            System.out.println("bosluk ıcerıyor");
    }
}
