class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for(int i=0; i<stones.length(); i++){
            charCountMap.merge(stones.charAt(i), 1, (oldVal, newVal)->oldVal+newVal);
        }
        
        int sum = 0;
        for(int i=0; i<jewels.length(); i++){
            if(charCountMap.containsKey(jewels.charAt(i)))
                sum += charCountMap.get(jewels.charAt(i));
        }
        
        return sum;
    }
}