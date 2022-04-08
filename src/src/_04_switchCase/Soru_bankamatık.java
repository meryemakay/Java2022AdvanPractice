package src._04_switchCase;

import java.util.Scanner;

public class Soru_bankamatık {
    public static void main(String[] args) {

          /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme,
   para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir ATM app.
   code create ediniz
   */
        System.out.println("   *****  ");
        System.out.println("   ATMye gosgeldınız  :  ");
        System.out.println("bakıye sorgulama :1\n para cekme: 2\n para yatırma:3\n cıkıs:4\nyapacagınız ıslemı secınız");

        Scanner scan=new Scanner(System.in);

int islem=scan.nextInt();
int bakıye=1000;


switch(islem){
    case 1:
        System.out.println("mevcut bakıyenız :" + bakıye);
        break;
    case 2:
        System.out.print("cekecegınız mıktrı gırınız:");
        int cekılenMIktar=scan.nextInt();
        if(cekılenMIktar>bakıye){
            System.out.println("para yok");

        }else{
            bakıye-=cekılenMIktar;
            System.out.println("bakıyenın guncel halı :"+bakıye);
        }
        break;
    case 3:
        System.out.println("yatırcagınuz mıktar gırınuz:");
        int yatırılanmıktar=scan.nextInt();
        bakıye+=yatırılanmıktar;
        System.out.println(bakıye);
        break;
    case 4:
        System.out.println("cıkısınız yapılmıstır yıne beklerız");
        break;

}






    }
}
