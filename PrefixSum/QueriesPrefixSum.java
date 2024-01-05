package PrefixSum;

/*
Queries using Prefixsum
i/p:
nums={1,6,3,2,7,2};
queries={{0,3},{2,5},{2,4}};
limit=13;
o/p;
True False True
*/
import java.util.*;

public class QueriesPrefixSum {
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
        int[] prefixsum = new int[n];
        prefixsum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + nums[i];
        }
        sc.close();
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            sum = prefixsum[queries[i][1]] - prefixsum[queries[i][0]] + nums[queries[i][0]];
            if (sum > limit) {
                System.out.println("False");
            } else {
                System.out.println("True");
            }
        }
    }
}