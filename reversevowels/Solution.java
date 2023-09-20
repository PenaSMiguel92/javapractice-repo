import java.util.*;
public class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] sChar = s.toCharArray();
        int n = s.length();
        int left = 0;
        int right = n - 1;
        while (left < right) {

            if (vowels.contains(sChar[left]) && vowels.contains(sChar[right])) {
                char temp = sChar[left];
                sChar[left] = sChar[right];
                sChar[right] = temp;
                left++;
                right--;
            }

            if (!vowels.contains(sChar[left]))
                left++;

            if (!vowels.contains(sChar[right]))
                right--;

            

        }
        
        return String.valueOf(sChar);
    }
}
