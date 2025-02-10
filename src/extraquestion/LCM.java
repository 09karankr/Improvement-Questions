package extraquestion;

import java.util.Scanner;

import static extraquestion.GCD.gcd;

public class LCM {
    public static int GCD(int a, int b){
        while(b!= 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b){
        return (a / gcd(a,b)) * b;
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1,num2) );

    }
}
