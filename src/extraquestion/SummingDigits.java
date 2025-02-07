//Summing Digits of a Number
//Difficulty: Easy
//Topics: Basic Programming, Mathematical Computations
//Description: Write a program to calculate the sum of digits of a number.
//Example:
//Input: number = 1234
//Output: 10
//Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.
package extraquestion;

import java.util.Scanner;

public class SummingDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String numInString = Integer.toString(num);
        int sum =0;
        for (int i=0; i<numInString.length(); i++){
            sum = sum + (numInString.charAt(i) - '0');
        }
        System.out.println(sum);
    }
}
