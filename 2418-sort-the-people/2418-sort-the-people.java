class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        List<People> data = new ArrayList<>();
        for(int i=0; i<names.length; i++){
            data.add(new People(names[i], heights[i]));
        }
        
        Collections.sort(data, (p1, p2) -> {
            return p2.height.compareTo(p1.height);
        });
        
        String[] result = new String[names.length];
        for(int i=0; i<result.length; i++){
            result[i] = data.get(i).name;
        }
        return result;
    }
}

class People{
    String name;
    Integer height;
    
    public People(String name, Integer height){
        this.name = name;
        this.height = height;
    }
}