package javatpoint;

public class fibo_series {
    public static void main(String[] args) {
        int x1=0,x2=1,sum=0;
        System.out.println(x1);
        System.out.println(x2);
        for(int i =0 ; i<=10 ; i++){
            sum=x1+x2;
            System.out.println(sum);
            x1=x2;
            x2=sum;
        }
    }
}
