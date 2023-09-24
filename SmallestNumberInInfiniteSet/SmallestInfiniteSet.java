import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.PriorityQueue;

public class SmallestInfiniteSet {
    Queue<Integer> addedIntegers;
    int currentInteger;
    public SmallestInfiniteSet() {
        addedIntegers = new PriorityQueue<>();
        currentInteger = 1;
    }

    public int popSmallest() {
        if (!addedIntegers.isEmpty())
            return addedIntegers.poll();
        
        return currentInteger++;
    }

    public void addBack(int num) {
        if (num < currentInteger)
            if (!addedIntegers.contains(num))
                addedIntegers.add(num);
    }
}
