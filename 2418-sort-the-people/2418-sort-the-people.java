class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] data = new String[100001];
        for(int i=0; i<heights.length; i++){
            data[heights[i]] = names[i];
        }
        
        String[] result = new String[names.length];
        for(int i=data.length-1, j=0; i>=0; i--){
            if(data[i] == null)
                continue;
            result[j++] = data[i];
        }
        
        return result;
    }
}
