class Solution {
    public int[] diStringMatch(String s) {
        char[] data = s.toCharArray();
        int[] res = new int[data.length+1];
        int iInc = 0;
        for(int i=0; i<data.length; i++){
            if(data[i] == 'I')
                res[i] = iInc++;
        }
        
        res[data.length] = iInc++;
        int dInc = iInc;
        
        for(int i=data.length-1; i>=0; i--){
            if(data[i] == 'D')
                res[i] = dInc++;                
        }
        
        return res;
    }
}
