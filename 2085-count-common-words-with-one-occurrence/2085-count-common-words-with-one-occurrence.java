class Solution {
    public int countWords(String[] words1, String[] words2) {
       Map<String,Integer> m1 = new HashMap<>();
       Map<String,Integer> m2 = new HashMap<>();
        for(String s: words1){
            m1.put(s,m1.getOrDefault(s,0)+1);
        }
        for(String s: words2){
            m2.put(s,m2.getOrDefault(s,0)+1);
        }
        int count = 0;
        for(Map.Entry<String,Integer> entry : m1.entrySet()){
            if(entry.getValue()==1){
                Integer value = m2.get(entry.getKey());
                if(value!=null&&value==1){
                    count+=1;
                }
            }
        }
        return count;
        
    }
}