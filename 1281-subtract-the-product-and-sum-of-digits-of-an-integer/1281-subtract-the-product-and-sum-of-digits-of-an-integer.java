class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n!=0){
            int current = n % 10;
            product *= current;
            sum += current;
            
            n = n / 10;
        }
        return product - sum;
    }
}