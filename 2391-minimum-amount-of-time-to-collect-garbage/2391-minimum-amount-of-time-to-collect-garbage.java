class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int papgerGarbageCost = findGarbageCollectionForOneType(garbage, travel, 'P');
        // System.out.println("papgerGarbageCost: "+papgerGarbageCost);
        int glassGarbageCost = findGarbageCollectionForOneType(garbage, travel, 'G');
        // System.out.println("glassGarbageCost: "+glassGarbageCost);
        int metalGarbageCost = findGarbageCollectionForOneType(garbage, travel, 'M');
        // System.out.println("metalGarbageCost: "+metalGarbageCost);
        
        int sum = papgerGarbageCost 
            + glassGarbageCost
            + metalGarbageCost;
        
        return sum;
    }
    
    public int findGarbageCollectionForOneType(String[] garbage, int[] travel, char garbageType)    {
        int collectingMinutes = 0;
        int travelMinutes = 0;
        int pendingTravelMinutes = 0;
        for(int i=0; i<garbage.length; i++){
            int numOfGarbageType = countOfCharOccurencesInString(garbage[i], garbageType);
            if(numOfGarbageType != 0){
                if(i > 0){
                    travelMinutes += pendingTravelMinutes;
                    travelMinutes += travel[i-1];
                    pendingTravelMinutes = 0;
                }
                collectingMinutes+=numOfGarbageType;
            }else{
                if(i > 0)
                    pendingTravelMinutes+=travel[i-1];
            }
            
        }
        // System.out.println("collectingMinutes: "+collectingMinutes);
        // System.out.println("travelMinutes: "+travelMinutes);
        return collectingMinutes+travelMinutes;
    }
    
    public int countOfCharOccurencesInString(String field, char key){
        int count = 0;
        for (int i = 0; i < field.length(); i++) {
            if (field.charAt(i) == key) {
                count++;
            }
        }
        return count;
    }
}