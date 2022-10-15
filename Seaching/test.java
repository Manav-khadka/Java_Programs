
// //{ Driver Code Starts
// import java.util.*;

// class test {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while (t-- > 0) {
// int n = sc.nextInt();
// int[] a = new int[n];
// for (int i = 0; i < n; i++)
// a[i] = sc.nextInt();
// GfG g = new GfG();
// System.out.println(g.palinArray(a, n));
// }
// sc.close();
// }
// }
// // } Driver Code Ends

// /* Complete the Function below */
// class GfG {
// public static int palinArray(int[] a, int n) {
// int count = 0;
// for (int i = 0; i < n; i++) {
// int num = a[i], rev = 0;
// while (num != 0) {
// int rem = num % 10;
// rev = rev * 10 + rem;
// num /= 10;
// }
// if (rev == a[i]) {
// count++;
// }
// }
// return n == count ? 1 : 0;

// }
// }