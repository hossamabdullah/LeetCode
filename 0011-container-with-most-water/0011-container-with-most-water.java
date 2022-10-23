class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i=0, j=height.length-1; i!=j; ){
            
            int length = j-i;
            
            int min = 0;
            if(height[i] < height[j]){
                min = height[i];
                i++;
            }else{
                min = height[j];
                j--;
            }
            int res = length * min;
            if(res > max)
                max = res;
                
        }
        return max;
    }
}