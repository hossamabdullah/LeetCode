class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for(int i=0; i<s.length(); i++){
            int j = i;
            char element = s.charAt(j);
            String subString = "";
            while(subString.indexOf(element) == -1){
                subString = subString + element;
                j = j + 1;
                if(j > s.length()-1)
                    break;
                element = s.charAt(j);
            }
            if(subString.length() > maxLength){
                maxLength = subString.length();
            }   
        }
        return maxLength;
    }
}