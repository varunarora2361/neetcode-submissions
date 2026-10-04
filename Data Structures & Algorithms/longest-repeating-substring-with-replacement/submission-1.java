class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // Increase frequency
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Maximum frequency in current window
            maxFreq = Math.max(maxFreq, map.get(ch));

            // If replacements required > k
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);

                // Decrease frequency
                map.put(leftChar, map.get(leftChar) - 1);

                left++;
            }

            // Current valid window
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}