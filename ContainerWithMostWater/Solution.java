public class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int left = 0, right = height.length - 1;
        int leftValue = height[left], rightValue = height[right];
        while (left < right) {
            

            int area = Math.min(leftValue, rightValue) * (right - left);
            max = Math.max(area, max);

            if (leftValue < rightValue) 
                leftValue = height[++left];
            else
                rightValue = height[--right];
        }

        return max;
    }
}
