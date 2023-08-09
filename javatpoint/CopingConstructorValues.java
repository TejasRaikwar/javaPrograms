package javatpoint;

public class CopingConstructorValues {
    int id;
    String name;

   CopingConstructorValues(){}   // Requires to copy

    CopingConstructorValues(int i , String n){
        id=i;
        name = n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    CopingConstructorValues(CopingConstructorValues c){
        id=c.id;
        name=c.name;
    }

    public static void main(String[] args) {
        CopingConstructorValues c1= new CopingConstructorValues(15,"Tejas");;
        CopingConstructorValues c2= new CopingConstructorValues(c1);    // Coping values with constructor
        CopingConstructorValues c3 = new CopingConstructorValues();
        c1.display();
        c2.display();

        c3.id = c1.id;     // Coping values without Constructor ;
        c3.name = c1.name;
        c3.display();
    }
}
