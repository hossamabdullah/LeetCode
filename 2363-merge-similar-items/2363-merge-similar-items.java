class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int maxLength = 0;
        for(int i=0; i<items1.length; i++){
            if(items1[i][0] > maxLength)
                maxLength = items1[i][0];
        }
        
        for(int i=0; i<items2.length; i++){
            if(items2[i][0] > maxLength)
                maxLength = items2[i][0];
        }
        
        
        int[][] res = new int[maxLength][2];
        
        Arrays.sort(items1, (a,b)->Integer.compare(a[0],b[0]));
        Arrays.sort(items2, (a,b)->Integer.compare(a[0],b[0]));
        
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while(index1 < items1.length && index2 < items2.length){
            if(items1[index1][0] == items2[index2][0]){
                res[index][0] = items1[index1][0];
                res[index][1] = items1[index1][1] + items2[index2][1];
                index++;
                index1++;
                index2++;
            }else{
                if(items1[index1][0] < items2[index2][0]){
                    res[index][0] = items1[index1][0];
                    res[index][1] = items1[index1][1];
                    index++;
                    index1++;
                }else{
                    res[index][0] = items2[index2][0];
                    res[index][1] = items2[index2][1];
                    index++;
                    index2++;
                }
            }
        }
        
        while(index1 < items1.length){
            res[index][0] = items1[index1][0];
            res[index][1] = items1[index1][1];
            index++;
            index1++;
        }
        
        while(index2 < items2.length){
            res[index][0] = items2[index2][0];
            res[index][1] = items2[index2][1];
            index++;
            index2++;
        }
        
        return twoDArrayToList(res);
    }
    
    public List<List<Integer>> twoDArrayToList(int[][] twoDArray) {
    List<List<Integer>> list = new ArrayList<>();
    for (int[] array : twoDArray) {
        List<Integer> data = new ArrayList<>();
        for(int i=0; i<array.length; i++){
            if(array[i] > 0)
                data.add(array[i]);
        }
        if(data.isEmpty())
            continue;
        list.add(data);
    }
    return list;
}
}