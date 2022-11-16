class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1)
            return 1;
        
        int[] count = new int[60];
        char[] data = s.toCharArray();
        for(int i=0; i<data.length; i++){
            count[data[i] - 'A']++;
        }
        
        int total = 0;
        boolean oddFlag = false;
        for(int i=0; i<60; i++){
            int res = count[i] / 2;
            total += res*2;
            if(count[i] % 2 !=0)
                oddFlag = true;
        }
        if(oddFlag)
            total++;
        return total;
    }
}