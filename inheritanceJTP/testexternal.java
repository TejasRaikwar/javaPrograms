package inheritanceJTP;

class baby extends animal{
    void prnt(){
        System.out.println("hello");
    }
}

public class testexternal {
    public static void main(String[] args) {
        baby b = new baby();
        b.prnt();
        b.eat();
    }
}
