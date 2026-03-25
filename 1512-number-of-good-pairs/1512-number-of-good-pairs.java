class Solution {
    public int numIdenticalPairs(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int sum=0;
        for(int i:nums){            
            list.add(i);
        }
        List<Integer> unique = new ArrayList<>();
        for(int i:nums){ 
            if(!unique.contains(i))           
            unique.add(i);
        }
        for(int i:unique){
            int n=0;
            if(Collections.frequency(list,i)>1){
                n=Collections.frequency(list,i);
                sum+=(n*(n-1)/2);
            }
        }
        return sum;
    }
}