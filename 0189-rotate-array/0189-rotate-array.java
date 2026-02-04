class Solution {
    public void rotate(int[] nums, int k) {
        int[] copy = nums.clone();
        int l = nums.length;
        for(int i=0;i<copy.length;i++){
            nums[(i+k)%l]=copy[i];
        }
        
    }
}