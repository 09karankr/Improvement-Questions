//Identifying Palindromes
//        Difficulty: Easy
//        Topics: Basic Programming, String Manipulation
//        Description: Write a program to check if a string or number is a palindrome.
//        Example:
//        Input: string = "radar"
//        Output: Palindrome
//        Explanation: "radar" reads the same backward as forward.

package extraquestion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        int j = str.length() -1;
        boolean isPalindrome = true;
        while (i<j){
            if(str.charAt(i) != str.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");


    }
}
