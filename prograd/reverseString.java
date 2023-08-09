package prograd;

public class reverseString {
    public static void main(String[] args) {
        String str = " Hello, Thanks for giving me this opportunity";
        int i=0, j=str.length()-1;
        char[] revString = new char[j+1];
        while (i<j){
            revString[j] = str.charAt(i);
            revString[i] = str.charAt(j);
            i++;j--;
        }
        System.out.println("Reversed String : "+String.valueOf(revString));
    }
}
