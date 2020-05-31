class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charMap= new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(!charMap.containsKey(ch)){
               charMap.put(ch, i);
            }
            else{
               charMap.put(ch,-1);
            }
        }
        
        int min= Integer.MAX_VALUE;
        for(char c: charMap.keySet()){
            if(charMap.get(c)> -1 && charMap.get(c)<min)
               min=charMap.get(c);
            //if(charMap.get(c) != 0)
               // return charMap.get(c);
        }
       return min==Integer.MAX_VALUE? -1 : min;
       //return -1;        
    }
}
