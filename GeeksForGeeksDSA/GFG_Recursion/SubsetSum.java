package GeeksForGeeksDSA.GFG_Recursion;

public class SubsetSum {
    static int countSubsets(int arr[], int num, int sum){
        if(num==0)
            return (sum==0)? 1:0;
        return countSubsets(arr,num-1,sum)+countSubsets(arr,num-1,sum-arr[num-1]);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30};
        int sum = 8;
        System.out.println(countSubsets(arr, arr.length, sum));
    }


}
