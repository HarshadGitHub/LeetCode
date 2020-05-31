class NumberComplement {
    public int findComplement(int num) {
        int rightShiftedBits=0;
        int temp=num;
        while(temp!=0){
            rightShiftedBits++;
            temp>>= 1;
        }
        int mask= (1<<rightShiftedBits)-1;
        return (~num) & mask;
    }
}
