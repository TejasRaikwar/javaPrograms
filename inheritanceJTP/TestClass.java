package inheritanceJTP;
import java.util.Scanner;


class TestClass {

    public static int arslice(int[] arr,int s,int e){
        int sum=0;

        for(int i = s ; i<=e ; i++){
            sum = sum+arr[i];
        }
        return sum;
    }

   static int sum(int[] arr){
        int big=0 , temp, sum=0, count = 1,i;


        while (count< arr.length) {


            for (i=0; i < arr.length; i++) {
                sum = sum + arslice(arr, i, count);
            }

            if(big<sum)
                big=sum;
            else
                continue;

        }

        return big;




    }


    public static void main(String args[] )  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(sum(arr));


    }

}