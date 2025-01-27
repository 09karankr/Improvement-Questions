//Question:Find the sum of all elements in an array.
package arrayquestions;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array: ");
        for(int i =0 ; i<n; i++){

            array[i] = sc.nextInt();
        }
        int sum =0;
        for (int i=0; i<n; i++){
            sum += array[i];
        }
        System.out.println(sum);
    }
}
