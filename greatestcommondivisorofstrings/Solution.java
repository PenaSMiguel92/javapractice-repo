public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String strA = str1 + str2;
        String strB = str2 + str1;
        String ans = "[test]";
        if (!strA.equals(strB))
            return "[]";
        int m = str1.length(); 
        int n = str2.length();
        int start = Math.min(m, n);
        int end = start + (Math.max(m, n) - start);
        String gcdBase = strA.substring(start, end);
        return gcdBase;
    }
} 
