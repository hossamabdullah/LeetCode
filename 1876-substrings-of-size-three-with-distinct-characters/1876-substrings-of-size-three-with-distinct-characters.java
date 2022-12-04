class Solution {
    public int countGoodSubstrings(String s) {
        int windowSize = 3;
        int count = 0;
        for(int i=0; i<=s.length()-windowSize; i++){
            String temp = s.substring(i, i+windowSize);
            if(areChractersUnique(temp)){
                count++;
            }
        }
        return count;
    }
    
    boolean areChractersUnique(String str){
        int checker = 0;
        for (int i = 0; i < str.length(); ++i){
            int val = (str.charAt(i)-'a');
            if ((checker & (1 << val)) > 0)
                return false;
            checker |= (1 << val);
        }
        return true;
    }
}