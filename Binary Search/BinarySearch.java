
/*
BINARY SEARCH
*/

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int i = 0, j = nums.length - 1;
        int target = 90;
        int flag = 0;
        while (i <= j) {
            int mid = (j - i) / 2 + i;
            if (nums[mid] == target) {
                System.out.println(nums[mid]);
                flag = 1;
                return;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            }
        }
        if (flag == 1) {
            System.out.print("-1");
        }
    }
}
