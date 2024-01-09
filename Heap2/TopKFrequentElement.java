package Heap2;

/*
Top k frequent elements
i/p:
nums={10,10,10,20,20,30}
k=20
o/p:
10 20
*/
import java.util.*;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int[] nums = { 10, 10, 10, 20, 20, 30 };
        int k = 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        // PriorityQueue<Integer> heap=new PriorityQueue<>(Comparator.reverseOrder());
        for (int m : map.keySet()) {
            heap.add(m);
            if (heap.size() > k) {
                heap.remove();
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(heap.remove());
        }
    }
}