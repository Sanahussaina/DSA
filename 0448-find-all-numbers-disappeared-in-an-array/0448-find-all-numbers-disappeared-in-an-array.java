class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        // for(int i=1;i<=nums.length;i++){
        //     list.add(i);
        // }
        // //Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(list.contains(nums[i])){
        //         list.remove(Integer.valueOf(nums[i]));
        //     }
        // }
        // return list;

        //Arrays.sort(nums);
        Set<Integer> set = new TreeSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;

    }
}