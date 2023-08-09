package inheritanceJTP;

class animal2{
    void eat1(){
        System.out.println("eating...");
    }
}
class Dog extends animal2{
    void bark1(){
        System.out.println("barking...");
    }
}
class cat extends animal2{
    void meow(){
        System.out.println("meowing");
    }
}


public class testInheritance {
    public static void main(String[] args) {
        cat c = new cat();
        c.meow();
        c.eat1();
    }

}
