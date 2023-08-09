package javatpoint;

import java.util.Scanner;

public class ArmStrong {
    static boolean check_armstrong(int num){
        int temp=num,sum=0,first,end=0;
        while(temp>0){
            temp=temp/10;
            end++;
        }
        temp=num;
        while (temp>0){
            first=temp%10;
            temp=temp/10;
            sum+=(Math.pow(first,end));
        }
        if(num==sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
         int n = sc.nextInt();

        if(check_armstrong(n))
            System.out.println(n+" is ArmStrong number");
        else
            System.out.println(n+" is not an ArmStrong number");

}}
