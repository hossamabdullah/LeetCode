class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(String s: strs){
            prefix = minPrefix(prefix, s);
        }
        return prefix;
    }
    
    public String minPrefix(String a, String b){
        int index = 0;
        for(int i=0; i<a.length(); i++){
            if(i >= b.length()){
                break;
            }
            
            if(a.charAt(i) == b.charAt(i))
                index = index + 1;
            else
                break;
        }
        
        return a.substring(0, index);
    }
}