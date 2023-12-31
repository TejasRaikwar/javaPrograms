package GeeksForGeeksDSA;

import java.util.Scanner;

public class chetyaHWI {
    public static int findGCD(int a, int b){
        //base condition
        if(b == 0)
            return a;

        return findGCD(b, a%b);
    }
    public static void main(String args[]) {
        int array[] = {8, 4, 2, 16};

        //initialize LCM and GCD with the first element
        int lcm = array[0];
        int gcd = array[0];

        //loop through the array to find GCD
        //use GCD to find the LCM
        for(int i=1; i<array.length; i++){
            gcd = findGCD(array[i], lcm);
            lcm = (lcm*array[i])/gcd;
        }

        //output the LCM
        System.out.println("LCM: "+lcm);
    }
}
