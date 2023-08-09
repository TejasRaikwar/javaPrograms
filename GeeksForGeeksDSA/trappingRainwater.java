package GeeksForGeeksDSA;

public class trappingRainwater {
    static int getWater(int[] arr){
        int result = 0;
        int n = arr.length;
        for(int i=1; i<n-1 ; i++){
            int lmax = arr[i];
            for(int j=0; j<i; j++)
                lmax = Math.max(lmax,arr[j]);
            int rmax = arr[i];
            for(int j = i+1; j<n; j++)
                rmax= Math.max(rmax,arr[j]);
            result += (Math.min(lmax,rmax)-arr[i]);
        }
        return result;
    }

    static int getWater2(int[] arr){
        int result  = 0;
        int n=arr.length;
        int[]  rmax = new int[n],lmax=new int[n];
        lmax[0] = arr[0];
        for(int i=1; i<n ; i++)
            lmax[i]=Math.max(lmax[i-1],arr[i]);
        rmax[n-1] = arr[n-1];
        for (int i=n-2; i>=0 ; i--)
            rmax[i] = Math.max(arr[i],rmax[i+1]);

        for (int i=0; i<n ; i++)
            result+=Math.min(lmax[i],rmax[i])-arr[i];
        return result;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,0,1,2,5};
        System.out.println(getWater(arr));
        System.out.println(getWater2(arr));
    }
}
