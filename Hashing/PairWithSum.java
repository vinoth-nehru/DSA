package Hashing;

/*
Pair with sum using Brute Force
i/p:
arr={,5,2,7,10,3,9}
target=8
o/p:
0 4
*/
import java.util.*;

public class PairWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }
        int flag = 0;
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (target == arr[i] + arr[j]) {
                    System.out.println(i + " " + j);
                    flag = 1;
                    break;
                    // return;
                    // returns from the main function no need for flag
                }
            }
            if (flag == 0) {
                System.out.println("-1 -1");
                break;
            }
        }
    }
}