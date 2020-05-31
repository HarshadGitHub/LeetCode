
        
class MaximumSubarraySumCircular {
    public int maxSubarraySumCircular(int[] A) {
        int max=0;
        int wrapMax=0;
        
        max= kadane(A);
        
        for(int i=0;i<A.length;i++) {  
			wrapMax+=A[i];
			A[i]*=-1;
		}
		wrapMax+=kadane(A);
        if(wrapMax==0)
            return max;
        return (wrapMax>max)?wrapMax:max;
    }
    
    private int kadane(int[] A){
        int maxCurrent= A[0];
        int maxGlobal= A[0];
        
        for(int i=1; i<A.length; i++){
            
            maxCurrent+= A[i];
            if(maxCurrent<A[i])
                maxCurrent=A[i];
            maxGlobal= Math.max(maxCurrent, maxGlobal);
        }
        return maxGlobal;
    }
}
