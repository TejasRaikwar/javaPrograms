package GeeksForGeeksDSA.GFG_Recursion;
import java.util.Scanner;

public class ropeCuttingProblem {

    static int maxlength(int n, int a, int b, int c){
        int res = 0;
        if(n==0)
        return 0;
        if(n < 0)
        return -1;

        int r1 = maxlength(n-a,a,b,c), r2 = maxlength(n-b,a,b,c), r3 = maxlength(n-c,a,b,c);

        if(r1>=r2 && r1>=r3)
        res = r1;
        else if(r2>=r1 && r2>=r3)
            res = r2;
        else
            res = r3;
        if(res == -1)
            return -1;
        return res+1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b,c,n;
        System.out.print("Enter Values for n, a, b, c : ");
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println(maxlength(n,a,b,c));
    }
}
