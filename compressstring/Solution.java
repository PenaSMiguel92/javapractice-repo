public class Solution {
    public int compress(char[] chars) {
        int length = chars.length;
        if (length == 1)
            return 1;

        int index = 0;
        int result = 0;
        while (index < length) {
            
            int groupLength = 1;
            char charVal = chars[index];
            while (index + 1 < length && chars[index] == chars[index + 1]) {
                groupLength++;
                index++;
            }
            if (groupLength == 1) {
                chars[result++] = charVal;
            } else if (groupLength > 1) {
                chars[result++] = charVal;
                for (char c : Integer.toString(groupLength).toCharArray())
                    chars[result++] = c;
            }
            index++;
        }
        
        return result;
    }
}
