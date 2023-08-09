package GeeksForGeeksDSA.GFG_Recursion;

import java.util.Scanner;

public class GenerateSubsets {

    static void subsets(String str,int index, String curr){
        int n = str.length();
        if(index == n)
            return;
        System.out.print(curr+" ");

        for (int i = index+1; i<n ; i++) {
            curr += str.charAt(i);
            subsets(str, i, curr);
            curr = curr.substring(0, curr.length()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();
        subsets(str,-1, "");
    }
}
