package Seaching;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 28, 9, 1, 0 };
        int key = 666;
        System.out.println(linearSearch(arr, key));
    }

    private static Boolean linearSearch(int[] arr, int key) {
        {
            Boolean result = false;
            for (int i : arr) {
                if (key == i) {
                    result = true;

                }

            }

            return result;
        }
    }

}
