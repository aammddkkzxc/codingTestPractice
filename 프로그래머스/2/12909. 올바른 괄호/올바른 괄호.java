import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push('(');
            }
            if(s.charAt(i) == ')' && stack.isEmpty()) {
                return false;
            }
            if(s.charAt(i) == ')') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}