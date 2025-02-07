package extraquestion;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orgNum = num;

        int cubeSum = 0;
        while(num>0){
            int digit = num % 10;
            cubeSum = cubeSum + (digit*digit*digit);
            num /= 10;
        }
        if(cubeSum == orgNum){
            System.out.println(orgNum + " is a armstrong number");
        }
        else {
            System.out.println(orgNum + " is not armstrong number");
        }


    }
}
