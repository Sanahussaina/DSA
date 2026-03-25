class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        List<Integer> l1 = new ArrayList<>();
        for(int i: arr){
            if(!l1.contains(i)){
                l1.add(i);
            }
        }
        List<Integer> l2 = new ArrayList<>();
        for(int i: arr){            
            l2.add(i);            
        }
        List<Integer> l3 = new ArrayList<>();
        for(int i: l1){
            int count=0;
            count=Collections.frequency(l2,i);
            l3.add(count);

        }
        for(int i:l3){
            if(Collections.frequency(l3,i)>1){
                return false;
            }
        }
        return true;

        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i: arr){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry = map.entrySet()){
        //     if(entry)
        // }
    }
}