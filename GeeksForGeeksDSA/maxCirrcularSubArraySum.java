package GeeksForGeeksDSA;

public class maxCirrcularSubArraySum {

    static int maxSubArraySum_regular(int[] arr){
        int res = arr[0],n=arr.length;
        for(int i =0 ; i<n ; i++){
            int curr_max = arr[i];
            int curr_sum = arr[i];
            for(int j=1 ; j<n ; j++ ) {
                int index = (i + j) % n;
                curr_sum += arr[index];
                curr_max=Math.max(curr_max,curr_sum);
            }
            res = Math.max(res, curr_max);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,6,-2, 3, 4};
        System.out.println(maxSubArraySum_regular(arr));
    }
}
