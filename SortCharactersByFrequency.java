class SortCharactersByFrequency {
    public String frequencySort(String s) {
        
        if(s==null || s.length()==1) return s;
        
        Map<Character,Integer> map= new HashMap<>();
        StringBuffer sb= new StringBuffer();
        
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        PriorityQueue<Character> pq= new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        
        while(!pq.isEmpty()){
            char c= pq.remove();
            for(int i=0; i<map.get(c); i++)
                sb.append(c);
        }
        
        return sb.toString();
    }
                    }
