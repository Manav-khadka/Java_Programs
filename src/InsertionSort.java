import java.util.Scanner;


    public class InsertionSort{
        public static void Insertion_Sort(int arr[]){
            for (int i=1;i<arr.length;i++){
                int current =arr[i];//3
                int j = i-1;//8
                while ( j>=0 && current<arr[j]){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=current;
            }
        }
    public static void main (String[] args){
        //code start
       int[] arr = {5,2,8,3,9,6};//{2,5,3,8}//
       Insertion_Sort( arr);
        System.out.println("THe sorted array is:");
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]);

       }



    }
}