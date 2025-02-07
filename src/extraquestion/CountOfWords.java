package extraquestion;
import java.util.Scanner;
public class CountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "hello world hello world hello world world";
        String input = sc.next();
        String[] data = string.split(" ");
        int count = 0;
        for(int i=0; i<data.length; i++)
        {
            if(data[i].equals(input))
            {
                count++;
            }
        }
        System.out.println("The input count is: " + count);
    }
}
