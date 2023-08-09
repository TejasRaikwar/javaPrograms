package practiceProblems.sortting;

public class binarySearch_Recursive {
    public static int binarySearch(int[] arr, int first, int last, int key){
        if (last>=first){
            int mid = first + (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearch(arr, first, mid-1, key);//search in left subarray
            }else{
                return binarySearch(arr, mid+1, last, key);//search in right subarray
            }
        }
        return -1;
    }

    public static void main(String[] args) {
      int[] arr = {10,20,30,40,50,60,70,80,90,100};
      int last = arr.length;
        System.out.println(binarySearch(arr,0,last,10));
    }
}
