import java.util.*;
public class Main {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        List<Integer> numList1 = Arrays.asList(100, 80, 60, 70, 60, 75, 85);
        List<Integer> ansList = new ArrayList<>();
        for (int num : numList1) {
            ansList.add(stockSpanner.next(num));
        }
        System.out.println(ansList);

        // StockSpanner stockSpanner2 = new StockSpanner();
        // List<Integer> numList2 = Arrays.asList(100, 80, 60, 70, 60, 75, 85);
        // List<Integer> ansList2 = new ArrayList<>();
        // for (int num : numList2) {
        //     ansList2.add(stockSpanner2.next(num));
        // }
        // System.out.println(ansList2);
        
    }
}
