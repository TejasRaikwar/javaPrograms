package practiceProblems.sortting;

public class GFG_binarySearch {
    public static int binarySearch(int[] arr, int first, int last, int key){
        if(first>last)
            return -1;
        int mid = (first+last)/2;
        if(key>arr[mid])
            return binarySearch(arr, mid+1,last,key);
        else if(key<arr[mid])
            return binarySearch(arr,first,mid-1,key);
        else{
            if(mid==0 || arr[mid-1] != arr[mid])
                return mid;
            else
                return binarySearch( arr, first,mid-1,key);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,10,12,10,20,20,20,30};
        int last = arr.length;
        System.out.println(binarySearch(arr,0,last,10));
    }
}
