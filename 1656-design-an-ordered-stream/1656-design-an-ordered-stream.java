class OrderedStream {
    String[] data;
    int ptr = 1;
    
    public OrderedStream(int n) {
        data = new String[n+1];    
    }
    
    public List<String> insert(int idKey, String value) {
        data[idKey] = value;
        List<String> result = new ArrayList<>();        
        
        while(ptr < data.length && data[ptr] !=null){
            result.add(data[ptr++]);
        }
        
        return result;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */