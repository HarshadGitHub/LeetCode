class SingleNumber {
    public int singleNumber(int[] nums) {
        
	   Set<Integer> set = new HashSet<>();
	   for (int n : nums) {
		   if (!set.add(n))
		    	set.remove(n);
	   }
	   Iterator<Integer> it = set.iterator();
        
	   return it.next();
    }
}
