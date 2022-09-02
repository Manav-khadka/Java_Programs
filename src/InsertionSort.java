import java.util.Scanner;


    public class InsertionSort{
        public static void Insertion_Sort(int arr[], int n){
            int i, key,j;
            for( i=1;i<n;i++){
                key =arr[i];
                j=i-1;
                while (j>-1 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
            }

        }
    public static void main (String[] args){
        //code start
        //input
        Scanner sc=new Scanner(System.in);
       int n;
       n=sc.nextInt();

       int[] arr = new int[n];
        System.out.println("Please enter the number which should be sorted");
       for (int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       Insertion_Sort( arr, n);
        System.out.println("THe sorted array is:");
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]);

       }



    }
}