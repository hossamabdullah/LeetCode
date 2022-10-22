public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        System.out.println(n);
        StringBuilder binaryRep = new StringBuilder(Integer.toBinaryString(n));
        System.out.println(binaryRep);
        binaryRep.reverse();
        while(binaryRep.length() != 32){
            binaryRep.append("0");
        }
        System.out.println(binaryRep);
        return (int)Long.parseLong(binaryRep.toString(), 2);
    }
}