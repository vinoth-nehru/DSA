/*
given an array of integers find the length of the subarray where the length is less tha or equal to k
k=8
arr={3,1,2,7,4,2,1,1,5};


 */

public class SubarraySum {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 7, 4, 2, 1, 1, 5 };
        int curr = 0;
        int l = 0;
        int ans = 0, k = 8;
        for (int r = 0; r < nums.length; r++) {
            curr += nums[r];
            while (curr > k) {
                curr = curr - nums[l];
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        System.out.println(ans);
    }

}
