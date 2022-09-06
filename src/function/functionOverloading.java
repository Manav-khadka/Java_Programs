package function;

public class functionOverloading {
    public static void main(String[] args) {
        fun(44);
        fun("manav");
    }

    private static void fun(int    a) {
        System.out.println(a);
    }
    private static void fun(String name) {
        System.out.println(name);
    }
}
