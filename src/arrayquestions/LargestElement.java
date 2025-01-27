
//Question name: Find the largest element in an array.
package arrayquestions;

public class LargestElement {
    public static void main(String[] args){
        int[] arr = {12,34,56,66,98};
        int temp = arr[0];
        for (int i=1; i<arr.length; i++){
           if(arr[i]>temp){
               temp = arr[i];
           }
        }
        System.out.println("Largest element is: " + temp);
        }

    }

