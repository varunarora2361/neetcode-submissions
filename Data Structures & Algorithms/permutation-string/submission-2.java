class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            count[s2.charAt(right) - 'a']--;
            if (right - left + 1 == s1.length()) {
                if (checkZeros(count)) {
                    return true;
                }
                count[s2.charAt(left) - 'a']++;
                left++;
            }
        }
        return false;
    }

    boolean checkZeros(int[] count) {
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}