package ex_09_switch;

import java.util.Scanner;

public class Lab_84_switchs {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter day number: ");
        int day=sc.nextInt();


        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUN");
                break;
            default:
                System.out.println("Invalid NUMBER");
        }
    }
}
