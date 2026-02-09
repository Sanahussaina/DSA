class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        if(sum%3==0){
            int targetsum = sum/3;
            int currsum = 0;
            int count = 0;
            for(int i=0;i<arr.length-1;i++){
                currsum +=arr[i];
                if(currsum==targetsum){
                    currsum = 0;
                    count++;
                }
            }
            if(count>=2){
                return true;
            }
        
        }
        return false;
        
    }
}