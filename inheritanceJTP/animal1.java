package inheritanceJTP;

public class animal1 {
    void eat0(){
        System.out.println("eating...");
    }
}
class dog0 extends animal1{
    void bark0(){
        System.out.println("barkink...");
    }
}
class babydog extends dog0{
    void weep(){
        System.out.println("weeping...");
    }
}
class testAnimal1{
    public static void main(String[] args) {
        babydog b = new babydog();
        b.weep();
        b.bark0();
        b.eat0();
    }
}
