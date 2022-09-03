import java.util.Scanner;

public class bubbleSort {
    public static void bubble_Sort(int arr[]){
       for (int i=0;i<arr.length-1;i++){  //array.length =n
           for (int j=0;j<arr.length-i-1;j++){
               if (arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }


    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array input are:-");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        bubble_Sort(arr);
        System.out.println("the sorted array is :-");
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }
}