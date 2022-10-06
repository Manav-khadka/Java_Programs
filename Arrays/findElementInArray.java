package Arrays;

public class findElementInArray {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 6, 8, 00, 4, 77, 33, 232, 33 };
        int element = 6;

        for (int i : arr) {
            if (element == arr[i]) {
                System.out.println(i);
                break;
            } else {
                System.out.println("not found");
            }

        }
    }

}
