import java.util.Scanner;

public class selectionSort {
    public static void selection_Sort(int arr[],int n){
        for (int i=0;i<n-1;i++){
            int min_idx=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min_idx]){
                    min_idx=j;

                }
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;

            }
        }



    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array input are:-");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        selection_Sort(arr,n);
        System.out.println("the sorted array is :-");
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }
}