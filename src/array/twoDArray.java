package array;

import java.util.Arrays;
import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {

//        int[][]  matA={
//                {1,2,3},
//                {4,5,8},
//                {7,8,9},
//        };
        Scanner sc =new Scanner(System.in);
        int[][] matA = new int[3][3];
        for (int i=0;i<matA.length;i++){
            for (int j=0;j<matA[i].length;j++){
                matA[i][j]=sc.nextInt();
            }

        }
        System.out.println("the array is :-");
        for (int[] a : matA){
            System.out.println(Arrays.toString(a));
        }
    }
}
