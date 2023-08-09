package HackerRank;
import java.util.Scanner;
public class smallestAndLargestSubString {
    public static String getSmallestAndLargestSubString(String s, int n){
        String small=s.substring(0,n);String large=s.substring(0,n);
        int len=s.length();
        String sub="";
        for(int i=1; i<len-n+1;i++){
           sub=s.substring(i,i+n);
           if(sub.compareTo(small)<0)
               small=sub;
           if(sub.compareTo(large)>0)
               large=sub;
            }
        System.out.println(s.length());
        return small+"\n"+large;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        System.out.println(getSmallestAndLargestSubString(s,n));
        sc.close();
    }
}
