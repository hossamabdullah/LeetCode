class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int sum = 0;
        for(int i=0; i<words.length; i++){
            boolean flag = false;            
            for(int j=0; j<words[i].length(); j++){
                if(allowed.indexOf(words[i].charAt(j)) == -1){
                    flag = true;
                    break;
                }
            }
            // System.out.println(words[i] + "  --  "  + flag);
            if(!flag)
                sum++;
            
        }
        return sum;
    }
}