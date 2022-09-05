package function;

import java.util.Scanner;

public class swapFunc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();

        System.out.println("numbers before swapping :"+a+" "+b);

        swap(a,b);
    }

     static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
         System.out.println("numbers after swapping:"+a+" "+b);
    }
}
