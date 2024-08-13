import java.util.Arrays;
import java.util.Scanner;

public class BasicLinearsearch {
    public static void main(String[] args) {
        int[] arr={1,4,5,7,3};

        System.out.println(Arrays.toString(arr));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element u want to search: ");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                System.out.println("Element found at Index: "+i);
        }
    }

}
