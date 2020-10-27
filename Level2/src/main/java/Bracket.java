import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {

    }

    boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        if (str[0] == ')') {
            return false;
        }
        if (str[0] == '(') {
            stack.push(str[0]);
        }

        for (int i = 1; i < str.length; i++) {
            if (str[i] == '(') {
                stack.push(str[i]);
            }
            if (str[i] == ')') {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if (!stack.empty()) {
            return false;
        }

        return answer;
    }

    boolean solution1(String s) {
        boolean answer = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }
            if (s.charAt(i) == ')') {
                count--;
            }
            if (count < 0) {
                break;
            }
        }
        if (count == 0) {
            answer = true;
        }

        return answer;
    }
}
