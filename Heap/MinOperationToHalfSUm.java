package Heap;

/*
Last Stone Weight
i/p:
nums={5,19,8,1}
o/p:
3
description:
Take TARGET AS SUM/2
loop till target>0
else find difference and add it to the heap
HEAP is is used to find the min/max element and it will auto sort with O(log n)
*/
import java.util.*;

public class MinOperationToHalfSUm {
    public static void main(String[] args) {
        int[] nums = { 5, 19, 8, 1 };
        double sum = 0;
        PriorityQueue<Double> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (double num : nums) {
            heap.add(num);
            sum += num;
        }
        double target = sum / 2;
        int c = 0;
        while (target > 0) {
            double half = heap.remove() / 2;
            heap.add(half);
            c++;
            target = target - half;

        }
        System.out.println(c);

    }
}
