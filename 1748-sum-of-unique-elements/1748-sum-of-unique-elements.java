class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        List<Integer> list = new ArrayList<>();
        for(int i: nums){
            list.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(Collections.frequency(list,nums[i])==1){
                sum+=nums[i];
            }
        }
        return sum;
        
    }
}