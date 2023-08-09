package GeeksForGeeksDSA;

public class maxDiffInArr {
    static int maxDiff_naive(int[] arr){
        int n = arr.length;
        int res=arr[1]-arr[0];
        for(int i =0 ; i<n-1 ; i++)
            for(int j = i+1; j<n ; j++)
                res = Math.max(res,arr[j]-arr[i]);
        return res;
    }
    static int maxDiff_Efficient(int[] arr){
        int res = arr[1]-arr[0];
        int n = arr.length;
        int minVal=arr[0];
        for(int j=1; j<n; j++){
            res = Math.max(res, arr[j]-minVal);
            minVal = Math.min(minVal,arr[j]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,10,6,4,8,1};
        System.out.println(maxDiff_naive(arr));
        System.out.println(maxDiff_Efficient(arr));
    }
}
