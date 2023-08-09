package practiceProblems;

import java.util.Locale;
import java.util.Scanner;

public class capitalizeFirstLetterInSentense {
    public static void main(String[] args) {
//  {      Scanner in = new Scanner(System.in);
//        System.out.print("Input a Sentence: ");
//        String line = in.nextLine();
//        String upper_case_line = "";
//        Scanner lineScan = new Scanner(line);
//        while(lineScan.hasNext()) {
//            String word = lineScan.next();
//            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
//        }
//        System.out.println(upper_case_line.trim());
//    }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line : ");
        String str = sc.nextLine();
        String upperCaseLine = "";
        Scanner  line = new Scanner(str.toLowerCase());
        while(line.hasNext()){
            String word = line.next();
            upperCaseLine = upperCaseLine + Character.toUpperCase(word.charAt(0))+ word.substring(1)+" ";
        }
        System.out.println(upperCaseLine.trim());
    }
}
