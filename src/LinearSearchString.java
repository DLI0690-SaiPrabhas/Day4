import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchString {
    public static void main(String[] args) {
        String[] arr={"Hi","Hello","Hey"};

        System.out.println(Arrays.toString(arr));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element u want to search: ");
        String key=sc.nextLine();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(key))
                System.out.println("Element found at Index: "+i);
        }
    }

}
