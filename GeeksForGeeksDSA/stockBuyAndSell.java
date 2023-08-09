package GeeksForGeeksDSA;


public class stockBuyAndSell {
    static int maxProfit_complicated(int[] arr, int start, int end){
        if(end<=start)
            return 0;
        int profit = 0 ;
        for(int i= start ; i<end ; i++){
            for(int j=i+1 ; j<end ; j++){                                                       //COMPLICATED ONE
                if(arr[j]>arr[i]){
                    int curr_profit = arr[j]-arr[i]+maxProfit_complicated(arr, start, i-1)+maxProfit_complicated(arr, j+1, end);
                    profit =  Math.max(profit,curr_profit);
                }
            }
        }
        return profit;
    }
    static  int maxProfit_Simple(int[] arr){
        int profit=0;
        for(int i=1; i<arr.length ; i++){                                                        // SIMPLE ONE
            if(arr[i]>arr[i-1])
                profit +=arr[i]-arr[i-1];
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,3,8,12};
        System.out.println(maxProfit_complicated(arr,0, arr.length));
        System.out.println(maxProfit_Simple(arr));
    }
}
