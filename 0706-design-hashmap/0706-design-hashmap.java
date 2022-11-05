class MyHashMap {
    Map<Integer, Integer> data;
    
    public MyHashMap() {
        data = new HashMap<>();
    }
    
    public void put(int key, int value) {
        data.put(key, value);   
    }
    
    public int get(int key) {
        if(data.containsKey(key))
            return data.get(key);
        else
            return -1;
    }
    
    public void remove(int key) {
        data.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */