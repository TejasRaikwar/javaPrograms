package inheritanceJTP;

import com.sun.nio.sctp.AbstractNotificationHandler;

class hello{
    String prt = "This is prt variable";
    void print(){
        System.out.println("This is from print method inside hello!");
    }
}
class helloworld extends hello{
        String prt = super.prt;
        void print(){
            System.out.println("This is from helloworld class!");
            super.print();
            System.out.println(prt);
        }

}
public class TestSuper {
    public static void main(String[] args) {
        helloworld h = new helloworld();
        h.print();


    }
}
