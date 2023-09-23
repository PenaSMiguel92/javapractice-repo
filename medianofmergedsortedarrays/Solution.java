public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalN = m + n;
        if (totalN == 1) 
            return m > n ? nums1[0] : nums2[0];
            
        int[] newArr = new int[totalN];
        int curIndex = 0;
        int left = 0;
        int right = 0;
        int steps = totalN % 2 == 0 ? (m + n) / 2 + 1 : (m + n + 1) / 2;
        while (curIndex < steps) {
            if (left < m && right < n)
                newArr[curIndex++] = nums1[left] < nums2[right] ? nums1[left++] : nums2[right++];
            else if (left < m)
                newArr[curIndex++] = nums1[left++];
            else if (right < n)
                newArr[curIndex++] = nums2[right++];
        }
        
        return totalN % 2 == 0 ? (newArr[curIndex - 1] + newArr[curIndex - 2]) / 2.0 : newArr[curIndex - 1];
    }
} 
