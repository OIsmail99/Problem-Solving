class Solution {
   public boolean isSubsequence(String s, String t) {
    if (s.length() == 0) return true; // An empty string is always a subsequence
    if (s.length() > t.length()) return false; // `s` cannot be a subsequence of a shorter string

    int s_index = 0; // Start from the beginning of `s`
    int t_index = 0; // Start from the beginning of `t`

    while (t_index < t.length()) {
        if (s.charAt(s_index) == t.charAt(t_index)) {
            s_index++; // Move to the next character in `s`
            if (s_index == s.length()) return true; // to avoid outOfBounds
        }
        t_index++; // Always move to the next character in `t`
    }

    return false; // If loop finishes and `s_index` < `s.length()`, `s` is not a subsequence
}

}