package prograd;

public class checkPalindrome {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "nayan";
        System.out.println("is "+str1+" pallindrome? : "+isPallindrome(str1));
    }
    public static String revword(String word){
        if(word==null || word.isEmpty())
            return word;
        return word.charAt(word.length()-1)+revword(word.substring(0,word.length()-1));
    }
    public static boolean isPallindrome(String word){
        String reverseWord = revword(word);
        if(word.equals(reverseWord))
            return true;
        return false;
    }
}
