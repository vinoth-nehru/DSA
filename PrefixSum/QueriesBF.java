package PrefixSum;

/*
Queries using Brute Force
i/p:
nums={1,6,3,2,7,2};
queries={{0,3},{2,5},{2,4}};
limit=13;
o/p;
True False True
*/
import java.util.*;

public class QueriesBF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] queries = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                queries[i][j] = sc.nextInt();
            }
        }
        int limit = sc.nextInt();
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int sum = 0;
            for (int j = x; j <= y; j++) {
                sum += nums[j];
            }
            if (sum > limit) {
                System.out.println("False");
            } else {
                System.out.println("True");
            }
        }
        sc.close();
    }
}
