package prograd;

public class printFibonacci {
    public static void fibonacci(int val1, int val2, int num){
        //Base case
        if (num==0)
            return;
        System.out.print(val1+val2+" ");
        fibonacci(val2,val1+val2,--num);
    }
    public static void main(String[] args) {
        System.out.println("*** Fibonacci series ***");
        System.out.print("0 1 ");
        fibonacci(0,1,10);
    }
}
