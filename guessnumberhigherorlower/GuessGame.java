public class GuessGame {
    private int guess_val;
    public GuessGame(int value) {
        this.guess_val = value;
    }
    public int guess(int num) {
        if (num < this.guess_val)
            return 1;

        if (num > this.guess_val)
            return -1;

        return 0;
    }
}
