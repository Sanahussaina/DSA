class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int p=0;
        int p2=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                if(max<i-p){
                    max=i-p;
                }
                
                p=i+1;
            }
            if(i==nums.length-1&&nums[i]==1){
                if(max<(i+1)-p){
                    max=(i+1)-p;
                }
            }
        }
        return max;
    }
}