package practiceProblems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class stringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new String : ");
        String str = sc.nextLine();
        int result = Integer.parseInt(str);
        System.out.println(result);

    }
}
