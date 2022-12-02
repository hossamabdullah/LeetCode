class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        for(int i=0; i<boxTypes.length-1; i++){
            int max = i;
            for(int j=i+1; j<boxTypes.length; j++){
                if(boxTypes[j][1] > boxTypes[max][1]){
                    max = j;
                }
            }

            int temp1 = boxTypes[max][0];
            int temp2 = boxTypes[max][1];

            boxTypes[max][0] = boxTypes[i][0]; 
            boxTypes[max][1] = boxTypes[i][1];

            boxTypes[i][0] = temp1;
            boxTypes[i][1] = temp2;
        }

        int res = 0;
        for(int i=0; i<boxTypes.length; i++){
            int boxCount = boxTypes[i][0];
            int usedBoxesCount = boxCount;
            if(usedBoxesCount > truckSize){
                usedBoxesCount = truckSize;
                truckSize = 0;
            }else{
                truckSize = truckSize - usedBoxesCount;
            }
            
            res += (usedBoxesCount * boxTypes[i][1]);
        }

        return res;
    }
}
