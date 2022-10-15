package Arrays;

public class arrayRotation {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 6, 5, 4, 7 };
        int d = 3;
        int n = arr.length;
        rotateArray(arr, d, n);
        PrintTheArray(arr, n);

    }

    static void rotateArray(int[] arr, int d, int n) {
        int[] temp = new int[n];
        int k = 0;
        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }

    static void PrintTheArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
