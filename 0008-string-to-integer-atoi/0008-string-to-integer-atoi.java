class Solution {
    double max = Math.pow(2, 31)-1;
    double min = Math.pow(2,31)*-1;
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty())
            return 0;
        ////////////////////////////////////////////////
        int startIndex = 0;
        while(startIndex < s.length() && !isDigitOrMinusOrPlus(s.charAt(startIndex))){
            startIndex++;
        }
        if(startIndex != 0)
            return 0;
        ////////////////////////////////////////////////
        int endIndex = startIndex+1;
        while(endIndex < s.length() && isDigit(s.charAt(endIndex))){
            endIndex++;
        }
        ////////////////////////////////////////////////
        if(s.length() > 0 && s.charAt(startIndex)=='+')
            startIndex++;
        s = s.substring(startIndex, endIndex);
        if(s.isEmpty() || s.equals("-"))
            return 0;
        ////////////////////////////////////////////////
        double value = Double.parseDouble(s);
        if(value > max){
            value = max;
        }
        if(value < min){
            value = min;
        }
        
        
        return (int)value;
    }
    
    public boolean isDigit(char c){
        return c>='0' && c<='9';
    }
    public boolean isDigitOrMinusOrPlus(char c){
        return c=='+' || c=='-' || isDigit(c);
    }
}