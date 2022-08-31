import java.util.*;

public class ComputeAvg {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        int sum = 0;
        System.out.println("Please enter 5 grades: ");
        for(int i = 0; i <= arr.length-1; i++){
            sum += arr[i] = sc.nextInt();

        }
        System.out.println(sum/arr.length-1);




    }

}
