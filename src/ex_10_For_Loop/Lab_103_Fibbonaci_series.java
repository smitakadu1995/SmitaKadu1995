package ex_10_For_Loop;

import java.util.Scanner;

public class Lab_103_Fibbonaci_series {
    public static void main(String[] args) {
        int a=0;
        int b=1;

        System.out.println("Etner the number fibonacci series ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(a + " " + b + " " );
        for (int i=2; i < n; i++)
        {

            int next=a+b;
            System.out.print(next +" ");
            a=b;
            b=next;
            if(next==1836311903) {
                break;
            }

        }
        System.out.println("");
        System.out.println("   Remaining series is negative, so I break the loop");
    }
}
