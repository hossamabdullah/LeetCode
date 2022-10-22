class Solution {
    public boolean isSameAfterReversals(int num) {
        String x = num+"";
        if(num != 0 && x.charAt(x.length()-1) == '0')
            return false;
        else
            return true;
    }
}