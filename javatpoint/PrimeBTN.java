package javatpoint;
import java.util.Scanner;

public class PrimeBTN {
    public static boolean checkprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number : ");
        int start = sc.nextInt();
        System.out.println("Enter last number : ");
        int end = sc.nextInt();
        System.out.print("Prime Numbers are: ");
        for (int i = start; i<=end ; i++){
            if(checkprime(i))
                System.out.print(i+" ");
        }
    }
}
