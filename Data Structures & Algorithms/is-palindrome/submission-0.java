class Solution {
    public boolean isPalindrome(String s) {
    int length = s.length();
    StringBuilder build = new StringBuilder(length);

    for(int i = 0; i< s.length(); i++){
    if(Character.isLetterOrDigit(s.charAt(i))){
            build.append(Character.toLowerCase(s.charAt(i)));
        }
    }

    String result = build.toString();

    for(int i = 0; i<result.length(); i++){
        if(result.charAt(i) != result.charAt(result.length() -1-i)){
            return false;
        }
    }
    return true;
    }
}
