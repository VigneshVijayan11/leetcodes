class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int target=k; ;target+=k){
            boolean found=false;
                for(int j=0;j<nums.length;j++){
                        if(nums[j]==target){
                            found=true;
                            break;
                }
             }
        if(!found){
            return target;
        }
        }
}
}