package anudip;
import java.util.Scanner;
public class countNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rs500 = 0, rs200 = 0, rs100=0, rs50 = 0, rs20 =0, rs10=0,rs5=0,rs2=0,rs1=0;
        System.out.println("Enter amount : ");
        int amt = sc.nextInt();

        while(amt>=500){
            rs500 = amt/500;
            amt= amt % 500;
            System.out.println("500Rs notes = "+rs500);
        }
        while (amt>=200){
            rs200 = amt/200;
            amt=amt%200;
            System.out.println("200Rs notes = "+rs200);
        }
        while (amt>=100){
            rs100 = amt/100;
            amt=amt%100;
            System.out.println("100Rs notes = "+rs100);
        }
        while (amt>=50){
            rs50 = amt/50;
            amt=amt%50;
            System.out.println("50Rs notes = "+rs50);
        }
        while (amt>=20){
            rs20 = amt/20;
            amt=amt%20;

            System.out.println("20Rs notes = "+rs20);
        }
        while (amt>=10){
            rs10 = amt/10;
            amt=amt%10;
            System.out.println("10Rs notes = "+rs10);
        }

        while (amt>=5){
            rs5 = amt/5;
            amt=amt%5;
            System.out.println("5Rs notes/coins = "+rs50);
        }
        while (amt>=2){
            rs2 = amt/2;
            amt=amt%2;
            System.out.println("2Rs coins = "+rs2);
        }
        if (amt>=1)
        System.out.println("1Rs coin = "+amt);

    }
}
