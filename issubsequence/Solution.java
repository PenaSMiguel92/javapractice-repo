public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() < 1 ) 
            return true;
        if (s.length() > t.length())
            return false;
        int n1 = s.length();
        int n2 = t.length();
        int subIndex = 0;
        for (int index = 0; index < n2; index++) {
            if (t.charAt(index) == s.charAt(subIndex))
                subIndex++;

            if (subIndex >= n1)
                return true;

            

        }
        return false;
    }
}
