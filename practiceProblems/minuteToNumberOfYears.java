package practiceProblems;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class minuteToNumberOfYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        int years, days;
        days = minutes/1440;
        years = days/365;

    }

}
