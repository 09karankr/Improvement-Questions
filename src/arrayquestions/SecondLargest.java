//Question: Find second largest element in an array.

package arrayquestions;

public class SecondLargest {
    public static void main(String[] args){

        int arr[] = {12,33,4,22,45,55};
        int largest = arr[0];
        int sec = -1;
        for (int i =1;i<arr.length; i++)
        {
            if(arr[i]>largest)
            {
                sec = largest;
                largest = arr[i];
            }
            if(largest<arr[i] && sec > arr[i]){
                sec = arr[i];
            }
        }
        System.out.println("second largest: " + sec);
        System.out.println("largest: " + largest);


        }

    }

