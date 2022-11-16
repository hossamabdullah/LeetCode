class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] data = new int[numRows][numRows*2-1];
        
        for(int i=1; i<=numRows; i++){
            int startIndex = numRows - i;
            int endIndex = numRows + i -1;
            if(i==1){
                data[i-1][startIndex] = 1;
                continue;
            }
            
            
            for(int j=startIndex; j<endIndex; j++){
                if(j == startIndex || j == endIndex -1)
                    data[i-1][j] = 1;
                else
                    data[i-1][j] = data[i-2][j-1] + data[i-2][j+1];
            }
            
        }
        
        // for(int i=0; i<data.length; i++){
        //     for(int j=0; j<data[i].length; j++){
        //         System.out.print(data[i][j] +"  ");
        //     }
        //     System.out.println();
        // }
        
        
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<data.length; i++){
            List<Integer> row  = new ArrayList<>();
            for(int j=0; j<data[i].length; j++){
                if(data[i][j] == 0)
                    continue;
                
                row.add(data[i][j]);
            }
            result.add(row);
        }
        return result;
    }
}


/*

0-0-0-0-1-0-0-0-0
0-0-0-1-0-1-0-0-0
0-0-1-0-2-0-1-0-0
0-1-0-3-0-3-0-1-0
1-0-4-0-6-0-4-0-1

*/