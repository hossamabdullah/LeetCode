class Solution {
    
    public int finalValueAfterOperations(String[] operations) {
        int xValue = 0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].contains("++"))
                xValue = xValue + 1;
            else
                xValue = xValue - 1;
        }
        return xValue;
    }
}