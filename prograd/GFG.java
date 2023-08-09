package prograd;
import java.util.Scanner;
class GFG {    static int numOfIncSubseqOfSizeK(int arr[], int n, int k) {
        int dp[][] = new int[k][n], sum = 0;
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;     }
        for (int l = 1; l < k; l++) {
            for (int i = l; i < n; i++) {
                dp[l][i] = 0;
                for (int j = l - 1; j < i; j++) {
                    if (arr[j] < arr[i]) {
                        dp[l][i] += dp[l - 1][j];
                    }    }   }
        }
        for (int i = k - 1; i < n; i++) {
            sum += dp[k - 1][i];
        }
        return sum;  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i] = sc.nextInt();
        int k = 3;
        System.out.print(numOfIncSubseqOfSizeK(arr, n, k));
    }
}
