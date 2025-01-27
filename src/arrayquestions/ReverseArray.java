//Question: Reverse an array.
package arrayquestions;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
      for(int i=0;i<n/2;i++){
          int temp = array[n-i-1];
          array[n-i-1]=array[i];
          array[i]=temp;
      }

            System.out.println(Arrays.toString(array));

    }
}
