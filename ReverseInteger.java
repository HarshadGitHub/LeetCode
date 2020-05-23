class ReverseInteger {
    public int reverse(int x) {
        int reverse=0;
        
        while(x!=0){
            int temp=reverse*10+ x%10;
            
            if((temp-x%10)/10 !=reverse) return 0;
            else reverse=temp;    
            x=x/10;
        }
       // if(reverse> Integer.MAX_VALUE || reverse<Integer.MIN_VALUE)
          //  return 0;
        //else
            return reverse;
    }
}
