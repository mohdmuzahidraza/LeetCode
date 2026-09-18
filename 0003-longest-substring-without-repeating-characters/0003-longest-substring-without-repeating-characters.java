class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while(right < s.length()){
            char ch = s.charAt(right);
            if(!set.contains(s.charAt(right))){
                set.add(ch);
                max = Math.max(max, set.size());
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}