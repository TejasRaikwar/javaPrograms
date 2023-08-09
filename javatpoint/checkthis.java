package javatpoint;

class test{
    int id;
    String name;
    float fee;
    test(int id , String name , float fee){
       this.id=id;
        this.fee=fee;
        this.name = name;
    }
    void display(){
        System.out.println("roll no.: "+id+",  name: "+name+",  Fee : "+fee);
    }
}

public class checkthis {
    public static void main(String[] args) {
        test t1 = new test(15,"Tejas",46460);
        test t2 = new test(18,"Harsh",15000);
        t1.display();
        t2.display();
    }

}
/*OUTPUT:     Without "This"  keyword :
C:\Users\raikw\.jdks\openjdk-17.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=61720:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "D:\STUDY\java learning\new\out\production\new" javatpoint.checkthis
roll no.: 0  name: nullFee : 0.0
roll no.: 0  name: nullFee : 0.0

Process finished with exit code 0
 */