class Solution {
    public boolean checkInclusion(String s1, String s2) {
 int left = 0; int max = 0;
        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        String st = new String(ch);
        for(int right = s1.length()-1; right < s2.length(); right++){
            String str = s2.substring(left, right+1);
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String newString = new String(chars);
                if(st.equals(newString)){
                    return true;
                } else {
                    left++;
                }
        }
        return false;
    }
}
