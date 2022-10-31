class Solution {
    private static final int A_ASCII = 97;
    public boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        char[] sentenceLetters = sentence.toLowerCase().toCharArray();
        
        for(int i=0; i<sentenceLetters.length; i++){
            alphabet[(int)sentenceLetters[i] - 97] = true;
        }
        
        for(int i=0; i<alphabet.length; i++){
            if(alphabet[i] == false)
                return false;
        }
        return true;
    }
}