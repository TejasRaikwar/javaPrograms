package GeeksForGeeksDSA;

public class Print_N_to_1 {

    static void fun2(int n){
        if(n==0)
            return;

        fun2(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        fun2(4);
    }
}
