public class Main {
    public static void main(String[] args) {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        smallestInfiniteSet.addBack(2);
        System.out.println(smallestInfiniteSet.popSmallest());
        System.out.println(smallestInfiniteSet.popSmallest());
        System.out.println(smallestInfiniteSet.popSmallest());
        smallestInfiniteSet.addBack(1);
        System.out.println(smallestInfiniteSet.popSmallest());
        System.out.println(smallestInfiniteSet.popSmallest());
        System.out.println(smallestInfiniteSet.popSmallest());
    }
} 
