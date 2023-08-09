package anudip;

public class Rems {
    public static void main (String args[]) {

        try{

            int j=0, x;

            x=Double.parseDouble(args[j]);

            System.out.println(x/0);

        }catch(Exception e) {

            System.out.println("Hi");

        }

    }
   }