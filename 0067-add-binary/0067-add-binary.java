class Solution {
    public String addBinary(String a, String b) {
        //find max length;
        int aLength = a.length();
        int bLength = b.length();
        int max = 0;
        if(bLength > aLength)
            max = bLength;
        else
            max = aLength;
        
        int aDiff = max - aLength;
        int bDiff = max - bLength;
        for(int i=0; i<aDiff; i++){
            a = "0"+a;
        }
        for(int i=0; i<bDiff; i++){
            b = "0"+b;
        }
        
        char[] aData = a.toCharArray();
        char[] bData = b.toCharArray();
        int acc = 0;
        StringBuilder builder = new StringBuilder();
        for(int i=aData.length-1; i>=0; i--){
            if(aData[i] == '1' && bData[i] == '1'){
                if(acc == 1){
                    builder.append("1");
                }else{
                    builder.append("0");   
                }
                acc = 1;
            }else if(aData[i] == '0' && bData[i] == '0'){
                if(acc == 1)
                    builder.append("1");
                else
                    builder.append("0");
                
                acc = 0;
            }else{
                if(acc == 1){
                    builder.append("0");
                    acc = 1;
                }else{
                    builder.append("1");   
                }
            }
        }
        if(acc == 1)
            builder.append("1");
        
        builder = builder.reverse();
        return builder.toString();
    }
}