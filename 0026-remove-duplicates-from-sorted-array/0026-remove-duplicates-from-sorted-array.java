class Solution {
    public int removeDuplicates(int[] nums) {
        // int ad=0;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[ad]!=nums[i]){
        //         ++ad;
        //         nums[ad]=nums[i];
        //     }
        // }
        // return ad+1;

        int i=0,j;
        for(j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
        
    }
    
}