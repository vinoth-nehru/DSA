package Stack;

/*
Valid Paranthesis
equal no of open and close return true else return false
*/
import java.util.*;

public class ValidParanathesis {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        String str = "{([]){}}";
        int flag = 1;
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else if (stack.empty()) {
                flag = 0;
            } else if (!stack.empty()) {
                if (map.get(stack.pop()) != c) {
                    flag = 0;
                }
            }
        }
        if (stack.empty() && flag == 1) {
            flag = 1;
        } else {
            flag = 0;
        }
        if (flag == 1) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}