package javatpoint;

import java.util.Scanner;

public class Operation {
    int square(int n){
        return n*n;
    }
}
class circle{
    Operation op; //aggregation ..
    double pi = 3.142;

    double area(int radius){
        op  = new Operation();
        int rsquare = op.square(radius);     //here, declare integer "rsquare" and call 'square method' from Operation class
        return  pi*rsquare;
    }


    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

        circle c = new circle();
        double d = c.area(5);
        System.out.println(d);

    }
}