import java.util.Arrays;
import java.util.Scanner;

public class FirstOccurance {
    public static void main(String[] args) {

        int[] arr={1,4,3,7,1,5,4,6,7};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target)
                System.out.println("Fist Occurance happened at index: "+i);
        }

    }

}
