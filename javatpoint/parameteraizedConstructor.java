package javatpoint;

public class parameteraizedConstructor {
    int i;
    String name;
    int age;
    parameteraizedConstructor(int n1, String nm1){
        i=n1;
        name=nm1;
    }
    parameteraizedConstructor(int n2 , String nm2, int a1){
        i=n2;
        name=nm2;
        age=a1;
    }
    void display(){
        System.out.println(i+" "+name+" "+age);
    }

    public static void main(String[] args) {
        parameteraizedConstructor n1 = new parameteraizedConstructor(15,"Tejas");
        n1.display();
        parameteraizedConstructor n2 = new parameteraizedConstructor(15,"Tejas",21);
        n2.display();
    }
}
