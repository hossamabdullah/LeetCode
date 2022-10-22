class Solution {
    
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumeralsMap = new HashMap<>();
        romanNumeralsMap.put('I',1);
        romanNumeralsMap.put('V',5);
        romanNumeralsMap.put('X',10);
        romanNumeralsMap.put('L',50);
        romanNumeralsMap.put('C',100);
        romanNumeralsMap.put('D',500);
        romanNumeralsMap.put('M',1000);
        
        char[] data = s.toCharArray();
        int sum = 0;
        int lastOne = 0;
        for(char letter: data){
            int currentOne = romanNumeralsMap.get(letter);
            if(lastOne != 0 && currentOne > lastOne){
                sum -= 2*lastOne;
            }
            sum += currentOne;
            lastOne = currentOne;
        }
        return sum;
    }
}