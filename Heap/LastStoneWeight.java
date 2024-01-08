package Heap;

/*
Last Stone Weight
i/p:
nums={2,7,4,1,8,1}
o/p:
1
description:
Take two stone of highest weight
if both stone weight is same remove both
else find difference and add it to the heap
HEAP is is used to find the min/max element and it will auto sort with O(log n)
*/
import java.util.*;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 4, 1, 8, 1 };
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : nums) {
            heap.add(stone);
        }
        while (heap.size() > 1) {
            int first = heap.remove();
            int second = heap.remove();
            if (first != second) {
                heap.add(first - second);
            }
        }
        if (heap.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(heap.peek());
        }
    }
}
