class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i=1; i<=arr.length; i+=2){
            int localSum = 0;
            for(int j=0; j<arr.length && j+i<=arr.length; j++){
                for(int k=j; k<j+i; k++){
                    localSum += arr[k];
                }
            }
            sum += localSum;
        }   
        return sum;
    }
}