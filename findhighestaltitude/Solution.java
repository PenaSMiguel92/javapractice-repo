public class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = Integer.MIN_VALUE;
        for (int g : gain) {
            if (currentAltitude > maxAltitude)
                maxAltitude = currentAltitude;
            currentAltitude += g;
        }
        if (currentAltitude > maxAltitude)
            maxAltitude = currentAltitude;
        return maxAltitude;
    }
}
