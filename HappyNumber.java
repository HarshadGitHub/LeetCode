class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set= new HashSet<>();
        
        while(!set.contains(n)){
            set.add(n);
            n= sum(n);
            if(n==1) return true;
        }
        return false;
        
    }
    
    private int sum(int n){
        int sum=0;
        while(n>0){
            sum+=(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }
}
