package stringquestions;

public class Reverse {
    public static void main(String[] args) {
        String str = "abcde";

        for (int i = 0; i < 3; i++) {  // Rotate 3 times
            str = rotateRight(str);
            System.out.println(str);
        }
    }

    public static String rotateRight(String str) {
        if (str.length() <= 1) {
            return str;  // No rotation needed for single-character strings
        }
        char lastChar = str.charAt(str.length() - 1); // Get last character
        return lastChar + str.substring(0, str.length() - 1); // Move last to front
    }
}
