import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        getFib(fib, n);
        return fib.get(fib.size()-1);
    }

    private void getFib(List<Integer> fib, int n) {
        for (int i = 2; i <= n; i++) {
            calculateFib(fib);
        }
    }

    private void calculateFib(List<Integer> fib) {
        fib.add((fib.get(fib.size()-2) + fib.get(fib.size()-1)) % 1234567);
    }
}