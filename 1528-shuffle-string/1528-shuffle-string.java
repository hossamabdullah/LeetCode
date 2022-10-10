class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        for(int i=0; i<indices.length; i++){
            builder.setCharAt(indices[i], s.charAt(i));
        }
        return builder.toString();
    }
}