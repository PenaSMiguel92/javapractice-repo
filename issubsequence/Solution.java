public class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int subIndex = 0;
        for (int index = 0; index < n2; index++) {
            if (subIndex >= n1)
                return true;

            if (t.charAt(index) == s.charAt(subIndex))
                subIndex++;

        }
        return false;
    }
}
