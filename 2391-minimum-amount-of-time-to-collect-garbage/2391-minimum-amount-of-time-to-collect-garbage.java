class Solution {
    
    public int garbageCollection(String[] garbage, int[] travel) {
        int collectionTime = 0;
        int paperTravelTime = 0;
        int glassTravelTime = 0;
        int metalTravelTime = 0;
        
        int[] accumlatedTravel = new int[travel.length];
        accumlatedTravel[0] = travel[0];
        for(int i=1; i <travel.length; i++){
            accumlatedTravel[i] = travel[i] + accumlatedTravel[i-1];
        }
        
        for(int i=garbage.length-1; i>=0; i--){
            collectionTime += garbage[i].length();
            if(i==0) break;
            if(garbage[i].indexOf('P')!=-1 && paperTravelTime ==0)
                paperTravelTime = accumlatedTravel[i-1];
            if(garbage[i].indexOf('G')!=-1 && glassTravelTime ==0)
                glassTravelTime = accumlatedTravel[i-1];
            if(garbage[i].indexOf('M')!=-1 && metalTravelTime ==0)
                metalTravelTime = accumlatedTravel[i-1];
        }
        
        return collectionTime + paperTravelTime + glassTravelTime + metalTravelTime;
    }
}