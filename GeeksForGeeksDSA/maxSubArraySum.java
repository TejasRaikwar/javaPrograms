package GeeksForGeeksDSA;


public class maxSubArraySum {
    static int printSum_regular(int[] arr){
        int res = arr[0], n=arr.length;
        for(int i=0; i<n ; i++){
            int curr=0;
            for(int j=i ; j<n ; j++){
                curr+=arr[j];
                res = Math.max(res,curr);
            }
        }
        return res;
    }
    static int printSum_Efficient(int[] arr2){
        int n = arr2.length;
        int res = arr2[0], maxEnding = arr2[0];
        for(int i=1; i<n ; i++){
            maxEnding=Math.max(maxEnding+arr2[i],arr2[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,-2,3,-1,2}, arr2=new int[]{-3,8,-2,4,-5,6};
//        System.out.println(printSum_regular(arr));
//        System.out.println(printSum_Efficient(arr2));
    }
}
