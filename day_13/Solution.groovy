class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        
        int longest = 1;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> seqRight = new HashSet<>();
            Set<Character> seqLeft = new HashSet<>();
            for (int j = i + 1; j < s.length(); j++) {
                if (seqRight.contains(s.charAt(j)) ||  (s.charAt(j) == s.charAt(i))) {
                    break;
                } else {
                    seqRight.add(s.charAt(j));
                }
            }
            for (int j = i - 1; j >= 0; j--) {
                if (seqLeft.contains(s.charAt(j)) || (s.charAt(j) == s.charAt(i))) {
                    break;
                } else {
                    seqLeft.add(s.charAt(j));
                }
            }
            
            Set<Character> combined = new HashSet<>();
            combined.add(s.charAt(i));
            combined.addAll(seqRight);
            combined.addAll(seqLeft);
            
            if (combined.size() == (seqLeft.size() + seqRight.size() + 1)) { // you can combine left and right and still have a unique substring
                longest = Math.max(longest, combined.size());
            } else {
                longest = Math.max(longest, Math.max(seqLeft.size(), seqRight.size()) + 1);
            }
        }
        return longest;
    }
}