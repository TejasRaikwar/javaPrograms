package practiceProblems;

import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = sc.nextLine();
        word = word.trim();
        String result = "";
        char[] ch = word.toCharArray();
        for(int i =ch.length-1; i<=0; i--){
            result+=ch[i];
        }

    }
}
