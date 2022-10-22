class Solution {
    public boolean isSameAfterReversals(int num) {
        String x = num+"";
        if(x.length() > 1 && x.charAt(x.length()-1) == '0')
            return false;
        else
            return true;
    }
}