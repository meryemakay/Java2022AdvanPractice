package src._05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str1=str.substring(0,1);
        String str2=str.substring(11,12);
        String str3=str.substring(8,9).toLowerCase();
        System.out.println(str1+" "+str2+" "+str3);

       char a=str.charAt(str.indexOf("A"));
       char l=str.charAt(str.indexOf("L"));
       char ı=str.charAt(str.indexOf("I"));

        System.out.println(""+a +" "+ "" +l+"" +
                " " +ı);

    }
    }


