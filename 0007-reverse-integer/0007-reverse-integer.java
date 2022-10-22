class Solution {
    public int reverse(int x) {
        StringBuilder builder = new StringBuilder();
        builder.append(x+"");
        
        boolean minusFlag = false;
        if(x < 0){
            minusFlag = true;
            builder.deleteCharAt(0);
        }
        
        builder.reverse();
        String newXStr = builder.toString();
        
        long longRes = Long.parseLong(newXStr);
        if(longRes > (Math.pow(2, 31)-1))
            return 0;
        int res = (int) longRes;
        if(minusFlag)
            return res*-1;
        else
            return res;
    }
}