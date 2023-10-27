import java.util.*;

public class StockSpanner {
    private final Deque<Integer[]> span;

    public StockSpanner() {
        span = new ArrayDeque<>();
    }

    public int next(int price) {
        int sum = 1;
        while (!span.isEmpty() && span.peek()[0] <= price) {
            sum += span.pop()[1];
        }
        span.push(new Integer[] { price, sum });
        return sum;
    }
}
