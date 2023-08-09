package javatpoint;

import java.util.Scanner;

public class pallindrome_number {

    static void CheckPallindrome(int n){
        int num = n, temp,rev_num=0;
        while (num!=0){
            rev_num=(rev_num*10)+(num%10);
            num=num/10;
        }
        if(n==rev_num)
            System.out.println(n+" is a Pallindrome Number.");
        else
            System.out.println(n+" is not a Pallindrome Number.");

    }

    public static void main(String[] args) {
        System.out.println("Enter a  number : ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        CheckPallindrome(n);
    }
}
