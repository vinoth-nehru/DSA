/*
 Given an array of nums find the length of the subarray where the product is less than or equal to k
k=100
arr={10,52,6}
 */

public class ProductLessThanK {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 6 };
        int curr = 1;
        int l = 0;
        int ans = 0, k = 100;
        for (int r = 0; r < nums.length; r++) {
            curr = curr * nums[r];
            while (curr >= k) {
                curr = curr / nums[l];
                l++;
            }

            ans = ans + r - l + 1;
        }
        System.out.println(ans);
    }
}
