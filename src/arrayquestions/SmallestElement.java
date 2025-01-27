//Question: Find the smallest element in an array

package arrayquestions;

public class SmallestElement {
    public static void main(String[] args){
        int arr[] = {1,44,6,33,9,4};
        int small = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("Smallest element is: " + small);
    }
}
