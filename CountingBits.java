class CountingBits {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        int index=1;
        int power=1;
        for(int i=1; i<=num; i++){
            if(i==power){
                result[i]=1;
                power<<=1;
                index=1;
            }
            else{
                result[i]=result[index]+1;
                index++;
            }
        }
        return result;
    }
}
