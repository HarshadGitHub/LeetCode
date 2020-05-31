
class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> magazineMap= new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            Character c= magazine.charAt(i);
            Integer count= magazineMap.get(c);
            if(count==null)
                magazineMap.put(magazine.charAt(i), 1);
            else
                magazineMap.put(c, ++count);                      
        }
        
        for(int i=0; i<ransomNote.length(); i++){
            Character rc= ransomNote.charAt(i);
            Integer count= magazineMap.get(rc);
            if(count==null || count<=0)
                return false;
            else
                magazineMap.put(rc, --count);
                
        }
            
        return true;
    }
}
