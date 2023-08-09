package GeeksForGeeksDSA.GFG_Recursion;
import java.util.Scanner;

public class checkPallindrome {
    static boolean isPallindrome(String str, int start, int end){
        if(start >=end)
            return true;
        return (str.charAt(start)==str.charAt(end) && isPallindrome(str,start+1,end-1));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        System.out.println(isPallindrome(str,0,str.length()-1));

    }
}
