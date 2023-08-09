package javatpoint;

public class thisKeyword {
  int a;
   int b;
    void fsdsd(int a , int b){
        int temp = a;
       a=b;
       b=temp;
   }

    public void thisDisplay(){
        System.out.println(a+" "+b);
    }
}
class thisTest{
    public static void main(String[] args) {
        thisKeyword t = new thisKeyword();
        t.fsdsd(5,4);
        t.thisDisplay();
    }
}
