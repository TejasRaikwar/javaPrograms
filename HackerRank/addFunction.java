package HackerRank;
import java.util.*;

public class addFunction{

    static void add(int[] arr) {
       int sum=0;
        for(int i =1 ; i<6 ; i++){

            for(int j=0 ; j<i ; j++){
                sum+=(arr[j]+arr[j++]);
                System.out.print(arr[j]+" +");
                if(j==i)
                    break;
                else
                    System.out.print(arr[j++]);

            }
            System.out.print("="+sum+"\n");
        }
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for(int i=0 ; i<6 ; i++){
            arr[i]=sc.nextInt();
        }
        add(arr);

    }

}
