public class FirstAndLastOccurences {

    public static int FirstAndLastOccurences(int arr[],int first,int last,int value){
        int mid=(first+last)/2;

        while (first<last){
            if(arr[mid]<value){
                first=mid+1;

            }
            else if(arr[mid]==value){
                while(arr[mid]==arr[mid-1]){
                    mid--;
                }
                System.out.println("First occurence of "+value+" value is : "+mid);
            }
            else
                last=mid-1;
        }

        return -1;

    }


    public static void main(String[] args) {
        int[] array={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int l=array.length-1;
        FirstAndLastOccurences f=new FirstAndLastOccurences();
        f.FirstAndLastOccurences(array,0,l,3);


    }
}
