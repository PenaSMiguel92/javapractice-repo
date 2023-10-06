import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length < 1 || points[0].length < 1)
            return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrow_pos = points[0][1];
        int arrows = 1;
        for (int[] point : points) {
            if (point[0] > arrow_pos) {
                arrow_pos = point[1];
                arrows++;
            }
        }
        
        return arrows;
    }
}
