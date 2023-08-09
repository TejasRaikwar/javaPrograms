package GeeksForGeeksDSA;

import java.util.Scanner;

public class sumofDigits {
    static int countSum(int num){
       int sum=0;
       if(num <= 9)
           return num;
       else
        return countSum(num/10)+num%10;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number  = sc.nextInt();
        System.out.println(countSum(number));

    }
}
