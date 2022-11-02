class Solution {
    public int balancedStringSplit(String s) {
        char[] data = s.toCharArray();
        int rFound = 0;
        int lFound = 0;
        
        int max = 0;
        for(int i=0; i<data.length; i++){
            if(data[i]=='R')
                rFound++;
            
            if(data[i]=='L')
                lFound++;
            
            if(rFound == lFound){
                //we have reached to a balanced String
                int matchCount = balancedStringSplit(s.substring(i+1, data.length)) + 1;
                if(matchCount > max)
                    max = matchCount;
                break;
            }
        }
        
        
        return max;
    }
}