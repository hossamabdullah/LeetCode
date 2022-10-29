class Solution {
    public int[] findArray(int[] pref) {
        int[] res = new int[pref.length];
        res[0] = pref[0];
        int acc = res[0];
        for(int i=1; i<pref.length; i++){
            res[i] = acc ^ pref[i];
            acc = acc ^ res[i];
            // System.out.println(acc +" ^ "+pref[i] + " = "+res[i]);
        }
        return res;
    }
}