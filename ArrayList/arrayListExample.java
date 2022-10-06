package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        // Adding elements to the list
        list.add(15);
        list.add(2);
        list.add(0);
        list.add(4);
        System.out.println(list);
        // [1, 2, 3, 4]

        // Get element at index 3

        System.out.println(list.get(3));

        // add element betweem
        list.add(2, 5);
        System.out.println(list);

        // set element at index 2
        list.set(2, 6);
        System.out.println(list);

        // remove element at index 2
        list.remove(2);
        System.out.println(list);

        // size of list
        System.out.println(list.size());

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // sorting a list

        Collections.sort(list);
        System.out.println(list);

        // input in arraylist
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            int input = sc.nextInt();
            list2.add(input);
        }
        Collections.sort(list2);
        System.out.println(list2);

    }

}
