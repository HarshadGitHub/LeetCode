
class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        
        int maxCurrent= nums[0];
        int maxGlobal= nums[0];
        
        for(int i=1; i<nums.length; i++){
            
            maxCurrent+= nums[i];
            if(maxCurrent<nums[i])
                maxCurrent=nums[i];
            maxGlobal= Math.max(maxCurrent, maxGlobal);
        }
        return maxGlobal;
        
    }
}
