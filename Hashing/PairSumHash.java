package Hashing;

/*
Pair with sum using Brute Force
i/p:
arr={,5,2,7,10,3,9}
target=8
o/p:
0 4
*/
import java.util.*;

public class PairSumHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }
        int target = sc.nextInt();
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hashMap.put(arr[i], i);
        }
        int comp = 0;
        for (int i = 0; i < n; i++) {
            comp = target - arr[i];
            if (hashMap.containsKey(comp)) {
                System.out.println(i + " " + hashMap.get(comp));
                return;
            }
        }
    }
}
