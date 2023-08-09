package GeeksForGeeksDSA.GFG_Recursion;

import java.util.Scanner;

public class sumOf_N_naturalNumberUsingRecursion {
    static public int countSum(int ip){
        if( ip == 0)
            return 0;
        return ip + countSum(ip-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int ip = sc.nextInt();
        System.out.println("Sum is : "+countSum(ip));

    }
}
