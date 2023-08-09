package javatpoint;

public class A0000000 {
    A0000000 getA1(){
        return this;
    }
    void msg(){
        System.out.println("Hello java !");
    }
}
class test2{
    public static void main(String[] args) {
        new A0000000().getA1().msg();
    }
}
