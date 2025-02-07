package extraquestion;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> squaredElements(ArrayList<Integer> arr){
        ArrayList<Integer> squared = new ArrayList<>();
        for (int it: arr){
            squared.add(it*it);
        }
        return squared;
    }
    public static ArrayList<Integer> evenList(ArrayList<Integer> arr){
        ArrayList<Integer> evens = new ArrayList<>();
        for (int it: arr){
            if(it % 2 == 0){
                evens.add(it);
            }

        }
        return evens;
    }
    public static void addToList(LinkedList list, ArrayList<Integer> arr ){
        int i =0;
        while (i<arr.size()){
            list.add(arr.get(i));
            i++;
        }
    }
    public static void sort(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i=0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (arr.get(i) > arr.get(j)){
                    int temp = arr.get(j);
                    arr.set(j,arr.get(i));
                    arr.set(i,temp);
                }
            }
        }
    }
    public static void addToArrayList(ArrayList<Integer> nums, int[] arr){
        for (int it: arr) nums.add(it);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,8,7};
        ArrayList<Integer> nums = new ArrayList<>();
        addToArrayList(nums,arr);
        System.out.println("Numbers are " + nums);
        ArrayList<Integer> squaredNums = squaredElements(nums);
        System.out.println("Squared Number list " + squaredNums);
        ArrayList<Integer> evenSquaredNums = evenList(squaredNums);
        System.out.println("even Squared Numbers" + evenSquaredNums);

        sort(evenSquaredNums);
        System.out.println("Sorted even squared numbers " +evenSquaredNums);
        LinkedList number= new LinkedList();
        addToList(number,evenSquaredNums);

        number.display();

    }
}
