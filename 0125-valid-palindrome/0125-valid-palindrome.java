class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]+", "");
        char[] data = s.toCharArray();
        for(int i=0; i<data.length/2; i++){
            if(data[i] != (data[data.length-i-1])){
                return false;
            }
                
        }
        return true;
    }
}