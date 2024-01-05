package PrefixSum;

/*
No of ways to split array-PrefixSum
i/p:
nums=10 4- 8 7
o/p;
2
*/
import java.util.*;

public class SplitArrayPrefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int fsum = 0, ssum = 0, c = 0;
        int[] prefixsum = new int[n];
        prefixsum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + nums[i];
        }
        for (int i = 0; i < n - 1; i++) {
            fsum = nums[i];
            ssum = prefixsum[n - i - 1] - prefixsum[i];
            if (fsum > ssum) {
                c += 1;
            }
        }
        sc.close();
        System.out.println(c);
    }
}
