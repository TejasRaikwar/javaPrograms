package javatpoint;

import java.util.Scanner;

public class prime_number {
    static void check_prime(int num){
        int i,m,flag=0;
        m=num/2;
        if(num==0 || num==1)
            System.out.println(num+" is not a Prime Number.");
        for(i=2 ; i<=m ; i++)
        {
            if(num%i==0) {
                System.out.println(num + " is not a Prime Number.");
                flag=1;
                break;
            }
        }
        if (flag==0)
            System.out.println(num+" is a Prime Number.");

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to be checked :");
        int n= sc.nextInt();
        check_prime(n);
    }
}
