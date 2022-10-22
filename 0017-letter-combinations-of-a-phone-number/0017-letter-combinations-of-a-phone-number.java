class Solution {
    
    public List<String> letterCombinations(String digits) {
        Map<Character, char[]> numMap = new HashMap<>();
        numMap.put('2', new char[]{'a','b','c'});
        numMap.put('3', new char[]{'d','e','f'});
        numMap.put('4', new char[]{'g','h','i'});
        numMap.put('5', new char[]{'j','k','l'});
        numMap.put('6', new char[]{'m','n','o'});
        numMap.put('7', new char[]{'p','q','r','s'});
        numMap.put('8', new char[]{'t','u','v'});
        numMap.put('9', new char[]{'w','x','y','z'});
        
        return btngan(digits, 0, numMap);
    }
    
    public List<String> btngan(String digits, int index, Map<Character, char[]> numMap){
        System.out.println(digits.length()+","+index);
        if(index == digits.length())
            return new ArrayList<>();
        if(index == digits.length()-1){
            char[] res = numMap.get(digits.charAt(digits.length()-1));
            List<String> resList = new ArrayList<>();
            for(char r: res){
                resList.add(r+"");
            }
            return resList;
        }
        
        List<String> data = btngan(digits, index+1, numMap);
        char[] currentData = numMap.get(digits.charAt(index));
        
        List<String> result = new ArrayList<>();
        for(char element: currentData){
            String entry = element + "";
            data.stream().forEach(d -> result.add(entry+d));
        }
        return result;
    }
}