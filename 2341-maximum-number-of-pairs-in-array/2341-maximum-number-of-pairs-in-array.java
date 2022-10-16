class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] data = new int[101];
        for(int i=0; i<nums.length; i++){
            data[nums[i]]++;
        }
        
        int pairs = 0;
        int remainings = 0;
        
        for(int i=0; i<data.length; i++){
            if(data[i] == 0)
                continue;
            
            int numOfPairs = data[i] / 2;
            pairs+= numOfPairs;
            int currentRem = data[i] %2;
            remainings += currentRem;
        }
        
        int[] res = new int[2];
        res[0] = pairs;
        res[1] = remainings;
        return res;
        
    }
}

/*

 0 1 2 3 4 5 6 7 8
[0,2,3,2,0,0,0,0,0,]



*/