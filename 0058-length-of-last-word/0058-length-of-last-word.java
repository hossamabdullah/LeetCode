class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] splitted = s.split(" ");
        return splitted[splitted.length-1].length();
    }
}