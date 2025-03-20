package ex_10_For_Loop;

import java.util.Scanner;

public class Lab_100_ForLoop {
    public static void main(String[] args) {
        for(int i=0;i<40;i++)
        {

            Scanner sc= new Scanner(System.in);
            int num= sc.nextInt();


            if(num%2==0)
            {
                System.out.println("Even no.--> " +num);
            }
            else {
                System.out.println("Odd num.--> " +num);
            }
        }
    }
}
