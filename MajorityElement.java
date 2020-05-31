class MajorityElement {
    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        
        if(n==1)
            return nums[0];
        
        for(int i : nums){
            
            if(map.containsKey(i) && (map.get(i)+1) > n/2)
                return i;
            else
                map.put(i,map.getOrDefault(i,0)+1);
        }
        
        return -1;
    }
}
