
/*
Longest Subsequence with minimum sum

*/
import java.util.*;

public class LongestSubsequence {
    public static void binary(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int flag = 0;
        int ans = 0;
        while (i <= j) {
            int mid = (j - i) / 2 + i;

            if (nums[mid] <= target) {
                i = mid + 1;
                ans = mid + 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            }
        }
        if (flag == 1) {
            System.out.print("-1");
        } else {
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 4, 5 };
        int query[] = { 3, 10, 21 };
        Arrays.sort(nums);
        int p[] = new int[nums.length];
        p[0] = nums[0];
        for (int num = 1; num < nums.length; num++) {
            p[num] = p[num - 1] + nums[num];
            // System.out.println(p[num]);
        }
        for (int num : query)
            binary(p, num);
    }
}
