package function;

import java.util.Arrays;

public class VariableArgument {
    public static void main(String[] args) {
        fun(2,4,5,6,2,4);
        multiple_argument(3,2,"manav","manavKhadka");
    }

    private static void multiple_argument(int i, int i1, String ...s) {
        System.out.println(Arrays.toString(s));
    }

    private static void fun(int...c) {
        System.out.println(Arrays.toString(c));
    }
}
