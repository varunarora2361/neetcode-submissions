class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;

        StringBuilder builder = new StringBuilder();
        int max = 0;

        for (char c: s.toCharArray()) {
            while(builder.indexOf(String.valueOf(c)) != -1){
                builder.deleteCharAt(0);
            }
            builder.append(c);
 
            max = Math.max(max, builder.length());
        }
        return max;
    }
}
