class TownJudge {
    public int findJudge(int N, int[][] trust) {
        
        int count[]= new int[N+1];
        
        for(int temp[] : trust){
            count[temp[0]]--;
            count[temp[1]]++;

        }
        
        for(int i=1; i<=N; i++){
           if(count[i]==N-1)
               return i;
        }

        return -1;
    }
}
