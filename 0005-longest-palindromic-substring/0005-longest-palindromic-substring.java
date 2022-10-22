class Solution {
    public String longestPalindrome(String s) {
        char[] data = s.toCharArray();
        int maxLengthStart = 0;
        int maxLengthEnd   = 0;
        
        
        for(int i=0; i<data.length-1; i++){
            int start = i;
            int end = i+1;
            
            while((start >= 0 && end < data.length) && data[start] == data[end]){
                start--;
                end++;
            }
            start++;
            end--;
            
            if(end-start > maxLengthEnd-maxLengthStart){
                maxLengthEnd = end;
                maxLengthStart = start;
            }
            
            
            start = i;
            end = i+2;
            while((start >= 0 && end < data.length) &&  data[start] == data[end]){
                start--;
                end++;
            }
            start++;
            end--;
            
            if(end-start > maxLengthEnd-maxLengthStart){
                maxLengthEnd = end;
                maxLengthStart = start;
            }
        }
        return s.substring(maxLengthStart, maxLengthEnd+1);
    }
}
