package GeeksForGeeksDSA;

public class freqInSortedArray {
    static void countFreq(int[] arr){
        int freq = 1, i=1, n=arr.length;
        while (i<n){
            while (i<n && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" : "+freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1]!=arr[n-2])
            System.out.println(arr[n-1]+" : "+1);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,10,10,20,20,30};
        countFreq(arr);
    }
}
