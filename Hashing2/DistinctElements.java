package Hashing2;

/*
Counting the no of distinct elements in a subarray
i/p:
s="eceba"
o/p:
3(ece)
*/
import java.util.*;

public class DistinctElements {
    public static void main(String[] args) {
        String str = new String("eceba");
        int k = 2;
        Map<Character, Integer> count = new HashMap<>();
        int r = 0, l = 0, ans = 0;
        for (r = 0; r < str.length(); r++) {
            char c = str.charAt(r);
            count.put(c, count.getOrDefault(c, 0) + 1);
            while (count.size() > k) {
                count.put(str.charAt(l), count.getOrDefault(str.charAt(l), 0) - 1);
                if (count.get(str.charAt(l)) == 0) {
                    count.remove(str.charAt(l));
                }
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        System.out.println(ans);
    }
}