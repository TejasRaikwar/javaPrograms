package GeeksForGeeksDSA;

public class moveZerosToEnd {

    static int[] moveZero(int[] arr) {
        int count = 0 ; int temp;
        for(int i =0 ; i< arr.length;i++){
            if(arr[i]!=0){
                temp = arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 0, 20, 0, 30, 40, 50, 60, 70, 80};
        arr = moveZero(arr);
        for(int i=0 ; i< arr.length ; i++)
            System.out.print(arr[i]+" ");
    }
}
