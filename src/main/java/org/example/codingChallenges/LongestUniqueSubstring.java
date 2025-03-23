package org.example.codingChallenges;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int length = longestUniqueSubstring(input);
        System.out.println(length);  // Output: 3
    }

    public static int longestUniqueSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
