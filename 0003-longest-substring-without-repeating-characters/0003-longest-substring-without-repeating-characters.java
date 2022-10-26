class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        
        int left = 0 , right = 0 , maxLen = 0;
        
        while(right < s.length()){
            char ch = s.charAt(right);
            
            while(!set.add(ch)){
                char ch1 = s.charAt(left++);
                set.remove(ch1);
            }
            
            maxLen = Math.max(right - left + 1 , maxLen);
            right++;
        }
        
        return maxLen;
    }
}