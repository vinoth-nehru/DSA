package Stack;

/*
Remove all adjacent duplicates
equal no of open and close return true else return false
*/
import java.util.*;

public class AdjacentDuplicates {
    public static String backspace(String str) {
        String s = str;
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#' && stack.length() > 0) {
                stack.deleteCharAt(stack.length() - 1);
            } else
                stack.append(c);
        }
        return stack.toString();
    }

    public static String undo(String str) {
        String s = str;
        StringBuilder stack = new StringBuilder();
        char del = ' ';
        for (char c : s.toCharArray()) {

            if (c != '#' && c != '^') {
                stack.append(c);
            }
            if (c == '#' && stack.length() > 0) {
                del = stack.charAt(stack.length() - 1);
                stack.deleteCharAt(stack.length() - 1);
            } else if (c == '^') {
                stack.append(del);
            }
        }
        return stack.toString();
    }

    public static String multipleundo(String str) {
        String s = str;
        StringBuilder stack = new StringBuilder();
        StringBuilder del = new StringBuilder();
        for (char c : s.toCharArray()) {

            if (c != '#' && c != '^') {
                stack.append(c);
            }
            if (c == '#' && stack.length() > 0) {
                del.append(stack.charAt(stack.length() - 1));
                stack.deleteCharAt(stack.length() - 1);
            } else if (c == '^') {
                stack.append(del.charAt(del.length() - 1));
                del.deleteCharAt(del.length() - 1);
            }
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        // Stack < Character > stack = new Stack <> ();
        String s = "ab#c";
        String s1 = "ab#^c";
        String s2 = "abc###^^^de";
        System.out.println(backspace(s));
        System.out.println(undo(s1));
        System.out.print(multipleundo(s2));
    }
}
