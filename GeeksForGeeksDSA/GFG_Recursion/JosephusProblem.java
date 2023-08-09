package GeeksForGeeksDSA.GFG_Recursion;

import java.util.Scanner;

public class JosephusProblem {
    static int JOS(int n, int k){
        if(n==1)
            return 0;
        else
            return (JOS(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n & k : ");
        int n = sc.nextInt(), k = sc.nextInt();
        System.out.println(JOS(n,k));
    }
}
