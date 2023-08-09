package GeeksForGeeksDSA;

public class array_isSorted {
   static boolean isSorted(int[] arr){
        for(int i =0 ; i<arr.length; i++)
            for(int j = i+1 ; j<arr.length ; j++)
                if(arr[j]<arr[i])
                    return false;
        return true;
    }
    static void reverseArr(int[] arr){
       int low = 0;
       int high = arr.length-1;
       int temp;
       while (low<high){
           temp = arr[high];
           arr[high] = arr[low];
           arr[low] = temp;
           low++;
           high--;
       }
    }
    public static void main(String[] args) {
      int[] arr = {12,23,45,67,78,89,98};
        System.out.println(isSorted(arr));
        reverseArr(arr);
        for(int i =0 ; i<arr.length ; i++)
            System.out.print(" "+arr[i]);
    }
}
