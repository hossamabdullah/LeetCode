class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == ')' && stack.search('(') ==1) stack.pop();
            else if(c == ']' && stack.search('[') ==1) stack.pop();
            else if(c == '}' && stack.search('{') ==1) stack.pop();
            else stack.push(c);
        }
        
        if(stack.size() == 0) return true;
        else                  return false;
    }
}