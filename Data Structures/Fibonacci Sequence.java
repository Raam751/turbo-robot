import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private Map<Integer, Integer> memo = new HashMap<>();

    public int fib(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);

        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(10)); // Output: 55
    }
}
