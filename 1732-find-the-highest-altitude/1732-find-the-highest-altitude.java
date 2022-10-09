class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;
        for(int i=0; i<gain.length; i++){
            altitude = altitude + gain[i];
            gain[i] = altitude;
            if(gain[i] > max)
                max = gain[i];
        }
        return max;
    }
}