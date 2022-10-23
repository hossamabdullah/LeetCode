class Solution {
    public boolean isPalindrome(int x) {
        String xStr  = x +"";
        boolean flag = true;
        for(int i=0; i<xStr.length()/2; i++){
            if(xStr.charAt(i) != xStr.charAt(xStr.length()-i-1))
                flag = false;
        }
        return flag;
    }
}