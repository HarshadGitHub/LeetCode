class RemoveKDigits {
    public int singleNonDuplicate(int[] nums) {
        int start=0,end=nums.length-1;
        
        while(start<end){
            int mid= (start + end)/2;
            if(mid%2==0){
               if(mid+1<nums.length && nums[mid]==nums[mid+1])
                start=mid+2;
                else
                 end=mid-1;
            }
            else{
                if(mid-1>=0 && nums[mid]==nums[mid-1])
                    start=mid+1;
                else
                    end=mid;

            }
            
        }
        return nums[start];
    }
}
