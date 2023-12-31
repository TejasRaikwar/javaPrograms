package GeeksForGeeksDSA;

public class longestEvenOddSubArray {
   static int maxEvenOdd_regular(int[] arr){
        int res =1, n=arr.length;
        for(int i= 0 ; i<n ; i++){
            int curr =1 ;
            for(int j=i+1 ; j<n ; j++){
                if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 &&  arr[j-1]%2==0))
                    curr++;
                else
                    break;
            }
            res = Math.max(res,curr);

        }
        return res;
    }
    static int maxEvenOdd_Effcient(int[] arr){
       int res =1 ;
       int curr=1, n = arr.length;
       for(int i =1; i<n;i++){
           if(  (arr[i]%2==0 && arr[i-1]%2!=0 ) || (arr[i]%2!=0 && arr[i-1]%2==0 )){
               curr++;
               res = Math.max(res,curr);
           }
           else
               curr=1;

       }
       return res;
   }
    public static void main(String[] args) {
        int[] arr = new int[]{5,10,20,6,3,8,1};

        System.out.println(maxEvenOdd_regular(arr));
        System.out.println(maxEvenOdd_Effcient(arr));
    }
}
