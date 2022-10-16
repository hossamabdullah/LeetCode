class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        
        for(int i=0; i<words.length; i++){
            int lastIndexOfCurrentWord = words[i].length() - 1;
            int index = words[i].charAt(lastIndexOfCurrentWord) - '0';
            sorted[index-1] = words[i].substring(0, lastIndexOfCurrentWord); 
            
            
            // int correctIndex = words[i].charAt(words[i].length()-1)-'0';
            // sorted[correctIndex-1] = words[i].substring(0, words[i].length()-1);
        }
        
        String result = String.join(" ", sorted);
        
        return result;
        
    }
}