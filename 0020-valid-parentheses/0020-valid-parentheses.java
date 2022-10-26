class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == ')'){
                System.out.println("3:"+stack.search('('));
                if(stack.search('(') != 1)
                    return false;
                else
                    stack.pop();
            }else if(c == '}'){
                System.out.println("2:"+stack.search('{'));
                if(stack.search('{') != 1)
                    return false;
                else
                    stack.pop();
            }else if(c == ']'){
                System.out.println("3:"+stack.search('['));
                if(stack.search('[') != 1)
                    return false;
                else
                    stack.pop();
            }else{
                stack.push(c);   
            }
        }
        
        if(stack.size() > 0 )
            return false;
        
        return true;
    }
}