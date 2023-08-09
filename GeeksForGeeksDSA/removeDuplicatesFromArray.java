package GeeksForGeeksDSA;
//remove dupluicates from sorted array

public class removeDuplicatesFromArray {

//    static int removeDup(int[] arr, int len){
//        int temp[] = new int[len];
//        temp[0] = arr[0];
//        int res = 1;
//        for(int i = 1 ; i<len ; i++){
//            if(arr[i-1]!=arr[i]){                                         NOT OPTIMAL SOLUTION
//                temp[res]=arr[i];
//                res++;
//            }
//        }
//        for(int i = 0 ; i<res;i++)
//            arr[i]=temp[i];
//        return res;
//
//    }


    static int removeDup(int[] arr , int len){
        int res = 1 ;
        for(int i =1 ;i<len ; i++){
            if(arr[i-1]!= arr[i]){                                  //OPTIMAL SOLUTION
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {10,10,10,20,20,30,40,40,40,40,4,50,60,70,80};
        System.out.println(removeDup(arr, arr.length));
    }
}
