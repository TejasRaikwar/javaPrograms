package javatpoint;

public class A {

    // Calling default constructor from paramaterised constructor ....
    A(){
        System.out.println("Hello A!");
    }
    A(int x){
        this();
        System.out.println(x);
    }

}
class B{

    //B for calling paramaterised constructor from default constructor

    B(){
        this(5);
        System.out.println("This is default constructor !");

    }
    B(int x){
        System.out.println("\nThis is paramaterised constructor !");
        System.out.println(x);
    }
}
class TestA{
    public static void main(String[] args) {
            new A(10);
            new B();
    }
}
