public class Solution extends GuessGame {
    public Solution(int value) {
        super(value);
    }

    public int guessNumber(int n) {
        int start = 0;
        int end = n;
        return binarySearch(start, end);
    }
    
    public int binarySearch(int start, int end) {
        int val = (start + end) / 2;
        int guessVal = guess(val);
        if (guessVal == 0)
            return val;

        if (guessVal > 0) {
            return binarySearch(val + 1, end);
        } else {
            return binarySearch(start, val);
        }
    }
} 
