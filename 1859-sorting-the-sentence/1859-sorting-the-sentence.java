class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        
        for(int i=0; i<words.length; i++){
            int lastIndexOfCurrentWord = words[i].length() - 1;
            int index = Integer.parseInt(""+words[i].charAt(lastIndexOfCurrentWord)) -1;
            sorted[index] = words[i].substring(0, lastIndexOfCurrentWord);  
        }
        
        String result = String.join(" ", sorted);
        
        return result;
        
    }
}