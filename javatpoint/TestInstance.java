package javatpoint;


class Testinstance2{
  Testinstance2(){
      System.out.println("constructor is invoked!");
  }
    {System.out.println("instance initialization block is invoked!");}
}

public class TestInstance {
   int speed;
   TestInstance(){
      // super();
       System.out.println("Speed is : "+speed);
   }
    {speed=100;}


    public static void main(String[] args) {
      // TestInstance b1 = new TestInstance();
       Testinstance2 b2= new Testinstance2();
//       Testinstance2 bb2 = new Testinstance2();
    }
}
