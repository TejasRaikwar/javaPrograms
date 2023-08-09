package GeeksForGeeksDSA;

public class leaderInArray {
    static void checkLeader(int[] arr){
        for(int i=0; i<arr.length; i++) {
            boolean flag = false;
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false)
                System.out.print(arr[i]+" ");
        }
    }
    static void checkLeaderOPT(int[] arr){
        int n = arr.length;
        int curr_leader = arr[n-1];
        System.out.print("\n"+curr_leader+" ");
        for(int i = n-2; i>=0; i--){
            if(curr_leader<arr[i])
            {
                curr_leader = arr[i];
                System.out.print(curr_leader+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={7, 10, 4, 3, 6, 5, 2};
        checkLeader(arr);
        checkLeaderOPT(arr);
    }
}
