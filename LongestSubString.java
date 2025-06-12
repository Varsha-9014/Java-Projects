package varsha;


import java.util.*;

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubString lss = new LongestSubString();

        String input = "abcabcbb";
        int length = lss.lengthOfLongestSubstring(input);
        System.out.println("Length of Longest Substring Without Repeating Characters: " + length);
    }
}
