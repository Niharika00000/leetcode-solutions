class Solution {
    public String longestPalindrome(String s) {
           if (s == null || s.length() < 1) 
           return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            
            int len1 = expandFromCenter(s, i, i);
           
            int len2 = expandFromCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            // Update start and end if we found a longer palindrome
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        // Return the longest palindromic substring
        return s.substring(start, end + 1);
    }

    // Helper function to expand around the center and return length of palindrome
    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // right - left - 1 is the length of the palindrome
        return right - left - 1;  
    }
}