class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0; i<sentences.length; i++){
            int count = (int)sentences[i].chars().filter(ch -> ch == ' ').count();
            if(count > max)
                max = count;
        }
        return max+1;
    }
}