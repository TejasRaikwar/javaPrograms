package practiceProblems;
import java.util.Scanner;

public class sumEqualToThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int number2 = sc.nextInt();
        System.out.println("Enter third number : ");
        int number3 = sc.nextInt();
        if(number1+number2==number3)
            System.out.println("true");
        else
            System.out.println("false");
    }

}
