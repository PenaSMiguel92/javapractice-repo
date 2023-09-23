public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalN = m + n;
        int[] newArr = new int[totalN];
        int curIndex = 0;
        int left = 0;
        int right = 0;
        int steps = totalN % 2 == 0 ? (m + n) / 2 + 1 : (m + n + 1) / 2;
        while (curIndex < steps) {
            if (left < nums1.length && right < nums2.length)
                newArr[curIndex++] = nums1[left] < nums2[right] ? nums1[left++] : nums2[right++];
            else if (left < nums1.length)
                newArr[curIndex++] = nums1[left++];
            else if (right < nums1.length)
                newArr[curIndex++] = nums2[right++];
        }
        
        return totalN % 2 == 0 ? (newArr[curIndex - 1] + newArr[curIndex - 2]) / 2.0 : newArr[curIndex - 1];
    }
} 
