import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.PriorityQueue;

public class SmallestInfiniteSet {
    Set<Integer> isPresent;
    Queue<Integer> addedIntegers;
    int currentInteger = 1;
    public SmallestInfiniteSet() {
        this.isPresent = new HashSet<Integer>();
        this.addedIntegers = new PriorityQueue<>();
    }

    public int popSmallest() {
        if (this.addedIntegers.size() < 1)
            return currentInteger++;

        int answer = this.addedIntegers.poll();
        this.isPresent.remove(answer);
        return answer;
    }

    public void addBack(int num) {
        if (num >= currentInteger || this.isPresent.contains(num))
            return;
        
        this.addedIntegers.offer(num);
        this.isPresent.add(num);
    }
}
