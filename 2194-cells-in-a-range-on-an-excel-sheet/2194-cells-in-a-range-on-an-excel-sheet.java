class Solution {
    public List<String> cellsInRange(String s) {
        String[] data = s.split(":");
        char startCellCol = data[0].charAt(0);
        int startCellRow  = Integer.parseInt(data[0].charAt(1)+"");
        
        char endCellCol = data[1].charAt(0);
        int endCellRow  = Integer.parseInt(data[1].charAt(1)+"");
        
        List<String> result = new ArrayList<>();
        for(int i=startCellCol; i<=endCellCol; i++){
            for(int j=startCellRow; j<=endCellRow; j++){
                String x = (char)i + "" + j;   
                result.add(x);
            }
        }
        return result;
    }
}