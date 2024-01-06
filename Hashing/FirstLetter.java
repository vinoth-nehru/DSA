package Hashing;

/*
First letter which  appears twice
i/p:
str="abcdeda"
target=d a
o/p:
0 4
*/
import java.util.*;

public class FirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        Set<Character> hashSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hashSet.contains(c)) {
                System.out.println(c);
            }
            hashSet.add(c);
        }
        sc.close();
    }
}
