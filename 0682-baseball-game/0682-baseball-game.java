class Solution {
    public int calPoints(String[] operations) {
        Integer prevPrev = null;
        Integer prev = null;
        List<Integer> values = new ArrayList<>();
        int index = 0;
        
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("+")){
                values.add(index, values.get(index-1)+values.get(index-2));
                index++;
            }else if(operations[i].equals("D")){
                values.add(index, values.get(index-1)*2);
                index++;
            }else if(operations[i].equals("C")){
                index--;
            }else{
                values.add(index, Integer.parseInt(operations[i]));
                index++;
            }
        }
        
        int sum=0;
        for(int i=0; i<index; i++){
            sum+=values.get(i);
        }
        return sum;
    }
}