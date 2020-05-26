class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i=0;
        int nonzero=0;
        
        while(i<nums.length){
            if(nums[i]!=0)
                nums[nonzero++]=nums[i];
            i++;
        }
        while(nonzero<nums.length)
            nums[nonzero++]=0;
        
    }
}
