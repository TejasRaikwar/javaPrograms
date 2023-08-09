package prograd;
import java.util.*;
import java.util.Scanner;
import java.lang.*;
public class AdditiveNumber {
    static boolean res;
    static void check_additive(String s, ArrayList<Integer> v, int st)
    {
        if (st == s.length() && v.size() > 2) {
            res = true;

            return;
        }

        int a = 0, b = 0, c = 0;
        if (v.size() >= 2) {
            b = v.get(v.size() - 1);
            a = v.get(v.size() - 2);
        }

        for (int i = st; i < s.length(); i++) {
            c = c * 10 + (s.charAt(i) - '0');
            if (v.size() < 2 && !res) {
                v.add(c);
                check_additive(s, v, i + 1);
                v.remove(v.size() - 1);
            } else if (c > (a + b) && !res)
                return;
            else if (c == a + b && !res) {

                v.add(c);

                check_additive(s, v, i + 1);

                v.remove(v.size() - 1);
            }
        }
    }
    static boolean isAdditiveSequence(String str)
    {
        if (str.length() <= 2)
            return false;

        ArrayList<Integer> v = new ArrayList<>();
        res = false;
        check_additive(str, v, 0);
        return res;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i =0 ; i<n ; i++){
             str[i] = sc.next();
    }
        for (int i =0 ; i<n ; i++){
            boolean ans = isAdditiveSequence(str[i]);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
}
}

