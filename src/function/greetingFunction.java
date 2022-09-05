package function;
import java.util.Scanner;

public class greetingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("namaste \uD83D\uDE4F\uD83C\uDFFD,Enter your name:");
        String name = sc.nextLine();
        greetingFuncname(name);



    }

     static void greetingFuncname(String name) {
         System.out.println("Good morning \uD83C\uDF04\uD83D\uDECC"+name);
    }
}
