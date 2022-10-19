class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        int teamsAdvance = n;
        while(teamsAdvance != 1){
            int oldTeamsAdvance = teamsAdvance;
            int numOfMatches = teamsAdvance/2;
            teamsAdvance = numOfMatches;
            
            if(oldTeamsAdvance%2 !=0)
                teamsAdvance++;
            
            count += numOfMatches;
        }
        return count;
    }
}