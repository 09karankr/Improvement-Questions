//Question: Check if an array is sorted or not.

package arrayquestions;

import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean areSorted = isSorted(arr);
        System.out.println(areSorted);
    }
        public static boolean isSorted(int[] arr){
            for(int i =1; i<arr.length; i++){
                if (arr[i] < arr[i -1]) {
                    return false;
                }
            }
            return true;
        }


    }


