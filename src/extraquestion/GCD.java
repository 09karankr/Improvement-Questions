//Finding the Greatest Common Divisor (GCD)
//        Difficulty: Easy
//        Topics: Basic Programming, Number Theory
//        Description: Write a program to find the GCD of two numbers.
//        Example:
//        Input: a = 48, b = 18
//        Output: 6
//        Explanation: The GCD of 48 and 18 is 6.

package extraquestion;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b){
        while(b!= 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Enter the two numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("GCD of " + num1 + " and" + num2 + " is: " + gcd(num1,num2) );


    }
}
