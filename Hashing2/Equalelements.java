package Hashing2;

/*
Checking equal no of elements in a array
i/p:
s="ABACBC"
o/p:
true
*/
import java.util.*;

public class Equalelements {
    public static void main(String[] args) {
        String str = new String("ABACBC");
        Map<Character, Integer> count = new HashMap<>();
        for (char c : str.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        Set<Integer> freq = new HashSet<>(count.values());
        System.out.println(freq.size() == 1);
    }
}