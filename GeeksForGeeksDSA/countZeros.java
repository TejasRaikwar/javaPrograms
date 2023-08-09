package GeeksForGeeksDSA;

import java.util.Scanner;

public class countZeros {
    static int count(int number){
        int result=0;
        for(int i=5 ; i<=number ; i=i*5){
            result=result+(number/i);}
        return result;}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        System.out.println(count(inputNum));

    }
}
