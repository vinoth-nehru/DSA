package Heap2;

/*
K closest element
i/p:
nums={1,4,10,15,22,12}
k=3
x=11
o/p:
15 10 12
description:
check for closest element from nums[i]-x
11-10=1, 15-11=4, 12-11=1
so 10 15 12
*/
import java.util.*;

public class KClosestElement {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 10, 15, 22, 12 };
        int k = 3;
        int x = 11;
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> {
            if (Math.abs(a - x) == Math.abs(b - x))
                return a - b;
            else
                return Math.abs(b - x) - Math.abs(a - x);
        });
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
            while (heap.size() > k) {
                heap.remove();
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(heap.remove());
        }
    }
}
