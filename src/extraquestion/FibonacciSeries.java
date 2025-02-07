package extraquestion;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the limit up to which you want fibonaci series");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        sc.close();

        ArrayList<Integer> fibList = generateFib(limit);
        System.out.println("Fibonacci series up to " + limit + ": " + fibList);
    }

    private static ArrayList<Integer> generateFib(int limit){
        ArrayList<Integer> series = new ArrayList<>();
        if(limit < 1){
            return series;
        }
        int a =0, b =1;
        series.add(a);
        if(limit >=1){
            series.add(b);
        }
        while (true){
            int next = a + b;
            if(next > limit) break;
            series.add(next);
            a = b;
            b = next;

        }
        return  series;
    }
}
