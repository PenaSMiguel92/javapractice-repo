import java.util.Deque;
import java.util.ArrayDeque;


public class Solution {
    public String removeStars(String s) {
        char[] ans;
        Deque<Character> charStack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '*')
                charStack.push(c);
            else
                charStack.pop();
        }
        ans = new char[charStack.size()];
        for (int i = ans.length - 1; i >= 0; i--){
            ans[i] = (char) charStack.pop();
        }
        
        return String.copyValueOf(ans);
    }
} 
