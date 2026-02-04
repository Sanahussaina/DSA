class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //ArrayList<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return true;
        }
       
        //l.add(nums[0]);
        // for(int i=1;i<nums.length;i++){
        //     if(l.contains(nums[i])){
        //         return true;
        //     }
        //     l.add(nums[i]);
        // }
        return false;
        
    }
}