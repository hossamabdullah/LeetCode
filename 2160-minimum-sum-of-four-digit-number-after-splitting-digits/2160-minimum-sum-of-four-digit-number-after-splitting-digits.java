class Solution {
    public int minimumSum(int num) {
        List<Integer> numbers = new LinkedList<>(); 
        for (int i = num; i > 0; i /= 10)
            numbers.add(i % 10);
        numbers = numbers.stream().sorted().collect(Collectors.toList());
        int sum = 0;
        for(int i=0; i<numbers.size()/2; i++){
            sum += (numbers.get(i)*10+numbers.get(numbers.size()-i-1));
        }
        return sum;
    }
}