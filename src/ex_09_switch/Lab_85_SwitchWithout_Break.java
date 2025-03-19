package ex_09_switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_85_SwitchWithout_Break {
    public static void main(String[] args) {
        int day;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter day number");
        day= sc.nextInt();

        switch (day)
        {
            case 1:
            System.out.println("mon");

            case 2:
            System.out.println("tue");

            default:
                System.out.println("invalid");

        }
    }
}
