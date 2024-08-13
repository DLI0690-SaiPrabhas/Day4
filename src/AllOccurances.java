import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AllOccurances {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,1,5,1};
        Scanner sc=new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a number to return indices: ");
        int value=sc.nextInt();
        List<Integer> arr2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                arr2.add(i);
            }
        }
        System.out.println(value+ " Found at indices: "+Arrays.toString(new List[]{arr2}));
    }
}
