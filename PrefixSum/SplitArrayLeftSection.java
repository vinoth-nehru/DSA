package PrefixSum;

/*
No of ways to split array-LEFT SECTION
i/p:
nums=10 4- 8 7
o/p;
2
*/
import java.util.*;

public class SplitArrayLeftSection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int lsection = 0, rsection = 0, c = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < n - 1; i++) {
            lsection += nums[i];
            rsection = sum - lsection;
            if (lsection > rsection) {
                c += 1;
            }
        }
        sc.close();
        System.out.println(c);
    }
}
