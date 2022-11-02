class Solution {
    public String decodeMessage(String key, String message) {
        char[] keysData = key.toCharArray();
        Map<Character, Integer> charToIndexMap = new HashMap<>();
        for(int i=0, index=0; i<keysData.length; i++){
            if(charToIndexMap.containsKey(keysData[i]) || keysData[i] == ' ')
                continue;
            charToIndexMap.put(keysData[i], index);
            index++;
        }
        
        StringBuilder builder = new StringBuilder();
        for(char c: message.toCharArray()){
            if(c == ' '){
                builder.append(c);
                continue;
            }
            builder.append((char)(charToIndexMap.get(c)+97));
        }
        return builder.toString();
    }
}