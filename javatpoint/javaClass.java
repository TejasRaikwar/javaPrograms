package javatpoint;
import java.util.Scanner;

class classToAccess{
    int roll;
    String name ;

    public void insert(int r, String n){
        roll = r;
        name = n;
    }
    public void display(){
        System.out.println("Name is "+name+"\nRoll No. is "+roll);
    }
}
class javaClass{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        classToAccess c1 = new classToAccess();
         c1.insert(s.nextInt(),s.next());
        c1.display();
    }
}