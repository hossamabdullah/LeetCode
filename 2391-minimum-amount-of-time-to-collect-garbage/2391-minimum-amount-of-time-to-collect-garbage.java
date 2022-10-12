class Solution {
    
    public int garbageCollection(String[] garbage, int[] travel) {
       int[] accumlatedTravel = new int[travel.length];
        accumlatedTravel[0] = travel[0];
        for(int i=1; i <travel.length; i++){
            accumlatedTravel[i] = travel[i] + accumlatedTravel[i-1];
        }
        
        int c=0;
        boolean p=false;
        boolean m=false;
        boolean g=false;
        
        for(int i=garbage.length-1; i>=0; i--){
            c += garbage[i].length();
            if(i==0)
                break;
            if(garbage[i].indexOf('P') != -1 && !p) { c+=accumlatedTravel[i-1]; p=true;}
            if(garbage[i].indexOf('M') != -1 && !m) { c+=accumlatedTravel[i-1]; m=true;}
            if(garbage[i].indexOf('G') != -1 && !g) { c+=accumlatedTravel[i-1]; g=true;}
            // if(p!=0 && m!=0 && g!=0)
                // break;
        }
        
        return c;
    }
}