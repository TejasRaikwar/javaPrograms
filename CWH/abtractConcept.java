package CWH;

public class abtractConcept {

    static abstract class parent{

        public abstract void greet();
    }
   static class child extends parent{
        public void greet(){
            System.out.println("good morning");
        }
    }

    public static void main(String[] args) {
        child c1 = new child();
        c1.greet();

    }
}
