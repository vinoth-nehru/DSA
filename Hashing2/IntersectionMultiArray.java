package Hashing2;

/*
Intersection of multiple arrays
i/p:
nums={{3,1,2,4,5},{1,2,,3,4},{3,4,5,6}}
o/p:
[3 4]
*/
import java.util.*;

public class IntersectionMultiArray {
    public static void main(String[] args) {
        int[][] nums = { { 3, 1, 2, 4, 5 }, { 1, 2, 3, 4 }, { 3, 4, 5, 6 } };
        Map<Integer, Integer> count = new HashMap<>();
        for (int i[] : nums) {
            for (int j : i) {
                count.put(j, count.getOrDefault(j, 0) + 1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int m : count.keySet()) {
            if (count.get(m) == nums.length) {
                arr.add(m);
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
