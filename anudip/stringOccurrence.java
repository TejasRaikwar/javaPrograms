package anudip;

public class stringOccurrence {
    public static void main(String[] args) {
        String str = "aaabcdddddefgggggghijjjjjjjkklnnnno";
        countOccurrences(str);
    }

    public static void countOccurrences(String string) {
        int i = 0;
        while (i < string.length()) {
            int count = 1;
            while (i + count < string.length() && string.charAt(i + count) == string.charAt(i)) {
                count++;
            }

            String substring = string.substring(i, i + count);
            int substringCount = getSubstringCount(string, substring);
            System.out.printf("\"%s\" occurred: %d times in the given string%n", substring, substringCount);
            i += count;
        }
    }

    public static int getSubstringCount(String string, String substring) {
        int count = 0;
        int index = 0;
        while ((index = string.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }
}
