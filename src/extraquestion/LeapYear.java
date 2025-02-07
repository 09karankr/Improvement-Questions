//Validating Leap Years
//Difficulty: Easy
//Topics: Basic Programming, Date Handling
//Description: Write a program to check if a given year is a leap year.
//        Example:
//Input: year = 2020
//Output: Leap Year
//Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year.
//
package extraquestion;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 ==0)
            System.out.println(year + " is a leap year");
        else if (year % 4 ==0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
