package javatpoint;

import java.util.Scanner;

public class factorial {
    static int fact(int num){
       if(num==0)
           return 1;
       else
           return (num*(fact(num-1)));
    }

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial is : "+fact(n));
    }
}
