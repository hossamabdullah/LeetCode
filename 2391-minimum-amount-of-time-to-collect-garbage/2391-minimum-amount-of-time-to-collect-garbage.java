class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int[] accumlatedTravels = new int[travel.length];
        accumlatedTravels[0] = travel[0];
        for(int i=1; i<travel.length; i++){
            accumlatedTravels[i] = travel[i] + accumlatedTravels[i-1];
        }
        int papgerGarbageCost = findGarbageCollectionForOneType(garbage, accumlatedTravels, 'P');
        // System.out.println("papgerGarbageCost: "+papgerGarbageCost);
        int glassGarbageCost = findGarbageCollectionForOneType(garbage, accumlatedTravels, 'G');
        // System.out.println("glassGarbageCost: "+glassGarbageCost);
        int metalGarbageCost = findGarbageCollectionForOneType(garbage, accumlatedTravels, 'M');
        // System.out.println("metalGarbageCost: "+metalGarbageCost);
        
        int sum = papgerGarbageCost 
            + glassGarbageCost
            + metalGarbageCost;
        
        return sum;
    }
    
     public int findGarbageCollectionForOneType(String[] garbage, int[] accumlatedTravels, char type){
        int movementTime = 0;
         StringBuilder allGarbage = new StringBuilder();
        for(int i=0; i<garbage.length; i++){
            allGarbage.append(garbage[i]);
        }
         
         int garbageCollectionTime = countOfCharOccurencesInString(allGarbage.toString(), type);
         
        for(int i=garbage.length-1; i>0; i--){
            int numOfGarbageType = countOfCharOccurencesInString(garbage[i], type);
            if(numOfGarbageType > 0){
                if(movementTime == 0)
                    movementTime = accumlatedTravels[i-1];
            }
        }
         
         return garbageCollectionTime + movementTime;
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