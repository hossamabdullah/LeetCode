class Solution {
    private static final String TYPE_RULE = "type";
    private static final int TYPE_INDEX = 0;
    private static final String COLOR_RULE = "color";
    private static final int COLOR_INDEX = 1;
    private static final String NAME_RULE = "name";
    private static final int NAME_INDEX = 2;
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        
        for(int i=0; i<items.size(); i++){
            if(ruleKey.equals(TYPE_RULE) 
                     && items.get(i).get(TYPE_INDEX).equals(ruleValue)){
                // System.out.println(i+"--- type");
                count++;
            }else if(ruleKey.equals(COLOR_RULE) 
                     && items.get(i).get(COLOR_INDEX).equals(ruleValue)){
                // System.out.println(i+"--- color");
                count++;
            }else if(ruleKey.equals(NAME_RULE)
                     && items.get(i).get(NAME_INDEX).equals(ruleValue)){
                // System.out.println(i+"--- name");
                count++;
            }
        }
        return count;
    }
}