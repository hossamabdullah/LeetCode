class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for(int i=0; i<points.length-1; i++){
            int xDiff = Math.abs(points[i+1][0] - points[i][0]);
            int yDiff = Math.abs(points[i+1][1] - points[i][1]);
            
            if(xDiff > yDiff)
                sum += xDiff;
            else
                sum += yDiff;
            
        }
        return sum;
    }
}