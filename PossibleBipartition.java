class PossibleBipartition {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        
        List<Integer>[] graph= new ArrayList[N];
        
        for(int i=0; i<N; i++)
            graph[i]= new ArrayList<>();
        
        for(int[] dislike : dislikes){
            int a= dislike[0]-1;
            int b= dislike[1]-1;
            
            graph[a].add(b);
            graph[b].add(a);
        }
        
        int[] colors= new int[N];
        
        for(int i=0; i<N; i++){
            if(colors[i]!=0) continue;
            
            colors[i]=1;
            
            Queue<Integer> queue= new LinkedList<>();
            queue.add(i);
            
            while(!queue.isEmpty()){
                int node= queue.remove();
                
                for(int adj: graph[node]){
                    if(colors[node]==colors[adj])
                        return false;
                    
                    if(colors[adj]==0){
                        colors[adj]=-colors[node];
                        queue.add(adj);
                    }
                }
            }
        }
        return true;
    }
}
