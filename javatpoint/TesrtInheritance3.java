package javatpoint;

class A5{
    A5(){
        System.out.println("parest class constructor invoked!");
    }
}
class B4 extends A5{
    B4(){
       super();
        System.out.println("child class constructor invoked!");
    }
    {
        System.out.println("Instunce initializer block invoked!");
    }
}

public class TesrtInheritance3 {
    public static void main(String[] args) {

        B4 b = new B4();
    }
}
