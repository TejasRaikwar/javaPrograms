package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        NumberFormat usnf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat innf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.println("US format = "+usnf.format(payment));
        System.out.println("India format = "+innf.format(payment));
        scanner.close();

    }
}
