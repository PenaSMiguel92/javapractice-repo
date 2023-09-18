public class Solution {
    public int compress(char[] chars) {
        if (chars.length < 2)
            return chars.length;
            
        int index = 0;
        int result = 0;
        int groupLength = 0;
        for (int i = 0; i < chars.length; i++) {
            
            if ((chars[index] != chars[i]) || (i == chars.length - 1)) {
                groupLength = ((chars[index] == chars[i]) && (i == chars.length - 1)) ? groupLength + 1 : groupLength;
                chars[result++] = chars[index];
                if (groupLength > 1 && groupLength < 10)
                    chars[result++] = (char) ('0' + groupLength);
                else if (groupLength > 9)
                    for (char c : Integer.toString(groupLength).toCharArray())
                        chars[result++] = c;
                
                

                groupLength = 1;
                index = i;
            } else {
                groupLength++;
            }

            if ((index > 1) && (chars[index-1] != chars[i]) && (i == chars.length - 1) && (groupLength == 1)) 
                    chars[result++] = chars[i];
            
        }
        
        return result;
    }
}
