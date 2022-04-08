package src._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10_pratıce {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter vehicle speed :");
        int currentSpeed=scan.nextInt();
        System.out.println("Is person has driver license? :");
        char isDriverLicenceAvailable=scan.next().toUpperCase().charAt(0);
        int ticketValue=0;
        if(currentSpeed>=55 && currentSpeed<=74) ticketValue=ticketValue+100;
        else if(currentSpeed>74 && currentSpeed<=84) ticketValue=ticketValue+150;
        else if(currentSpeed>84 && currentSpeed<=94) ticketValue=ticketValue+320;
        else if(currentSpeed>95) ticketValue=ticketValue+500;
        else ticketValue=0;

        if (isDriverLicenceAvailable=='Y') {
            if (ticketValue==0) {
                System.out.println("You are driving well! Thank ya sweetheart!");
            }   else System.out.println("Your ticket value is: " + ticketValue);
        }
        else if (isDriverLicenceAvailable=='N') System.out.println("Your ticket value is: " + (ticketValue+200));
        else System.out.println("Wrong input, please try again.");
    }
}
