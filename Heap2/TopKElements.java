package Heap2;

/*
Top K elements
ip:
nums={10,20,30,40,50,60,70,90,80,100}
k=2
o/p:
minheap=100 90 80
maxheap=30 20 10
description:
Find the top k min or max elements using complexity of O(nlog k)
min heap removes minimum elements above size of K
max heap removes maximum elements above size of K
*/
import java.util.*;

public class TopKElements {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60, 70, 90, 80, 100 };
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());
        int k = 2;
        for (int num : nums) {
            maxheap.add(num);
            minheap.add(num);
            if (minheap.size() > k)
                minheap.remove();
            if (maxheap.size() > k)
                maxheap.remove();
            // System.out.println(maxheap.peek());
            // System.out.println(minheap.peek());
        }
        for (int x = 0; x < k; x++) {
            System.out.println(minheap.remove());
        }
        for (int x = 0; x < k; x++) {
            System.out.println(maxheap.remove());
        }
    }
}
