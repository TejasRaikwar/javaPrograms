package GeeksForGeeksDSA;

public class leftRotate_Arrray {
    static int[] leftRotate(int[] arr){
        int len = arr.length;
        int temp=arr[0];
        for(int i=1; i<len ; i++){
            arr[i-1]=arr[i];
        }
        arr[len-1]=temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        arr = leftRotate(arr);
        for (int i =0 ; i< arr.length ; i++)
            System.out.print(arr[i]+" ");
    }
}
