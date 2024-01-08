package Heap;

/*
Find median from Data stream
i/p:
nums={1,3,7,13,36,100};
o/p:
10
description:
add to maxheap
add to minheap and remove from maxheap
if maxheap and minheap size is not equal then remove  from minheap and add from max heap
if maxheap and minheap size is even then maxheap.remove()+minheap.remove())/2
if maxheap and minheap size is odd then maxheap.remove()
else find difference and add it to the heap
HEAP is is used to find the min/max element and it will auto sort with O(log n)
*/
import java.util.*;

public class FindMedianDataStream {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 7, 13, 36, 100 };
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            maxheap.add(num);
            minheap.add(maxheap.remove());
            if (minheap.size() != maxheap.size()) {
                maxheap.add(minheap.remove());
            }
        }
        if (maxheap.size() == minheap.size()) {
            System.out.println((maxheap.remove() + minheap.remove()) / 2);
        } else {
            System.out.println(maxheap.remove());
        }
    }
}
