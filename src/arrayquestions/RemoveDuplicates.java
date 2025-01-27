//Question: Remove duplicates from a sorted array.

package arrayquestions;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       int len = removeDuplicates( arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, len)));
        System.out.println("New length: " + len);
        System.out.println(len);


    }
    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int index =0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
        }

        return index + 1;
    }
}
