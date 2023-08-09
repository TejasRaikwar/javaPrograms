package javatpoint;

public class CounterWithAndWthtStatic {
    int count1=0;
    static int count2=0;
    CounterWithAndWthtStatic(){
        count1++; count2++;
        System.out.println("without static : "+count1+"    with static : "+count2);
    }
    public static void main(String[] args) {
        CounterWithAndWthtStatic c1=new CounterWithAndWthtStatic();
        CounterWithAndWthtStatic c2 = new CounterWithAndWthtStatic();
        CounterWithAndWthtStatic c3 = new CounterWithAndWthtStatic();
    }
}
