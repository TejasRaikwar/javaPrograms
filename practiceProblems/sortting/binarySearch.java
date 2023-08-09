package practiceProblems.sortting;

public class binarySearch {

    public static void search(int[] arr, int first, int last, int key){
       int mid=(first+last)/2;

       if(key<arr[first] || key>arr[last-1]){
           System.out.println("element not in array");
           return;
       }
       while(first<=last){
           if(arr[first]==key){
               System.out.println("Element at : "+first);
               break;
           }
           else if(arr[last-1]==key){
               System.out.println("Element at : "+last);
               break;
           }
           else if(arr[mid]<key)
                first = mid+1;
            else if(arr[mid]==key){
                System.out.println("Element at : "+mid);
                break;
            }
            else{
                last = mid - 1;
            }
            mid = (first+last)/2;
        }
        if(first > last)
            System.out.println("Element not fount");
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,40,50,60,70,80,90,100};
       int start = 0;
       int max = arr.length;
      int key=100;
       search(arr,start,max,key);

    }
}
