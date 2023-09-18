public class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int result = 0;
        int groupLength = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[index] != chars[i]) {
                chars[result++] = chars[index];
                if (groupLength > 1 && groupLength < 10)
                    chars[result++] = (char) ('0' + groupLength);
                else if (groupLength > 9)
                    for (char c : Integer.toString(groupLength).toCharArray())
                        chars[result++] = c;

                groupLength = 0;
                index = i;
            } else {
                groupLength++;
            }
        }
        
        return result;
    }
}
