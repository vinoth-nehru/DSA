package PrefixSum;

/*
No of ways to split array-Brute Force
i/p:
nums=10 4- 8 7
o/p;
2
*/
import java.util.*;

public class SplitArrayBF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int fsum = 0, ssum = 0, c = 0;
        for (int i = 0; i < n - 1; i++) {
            fsum += nums[i];
            for (int j = i + 1; j < n; j++) {
                ssum += nums[j];
            }
            if (fsum > ssum) {
                c += 1;
            }
        }
        sc.close();
        System.out.println(c);
    }
}
