class Solution {
    public boolean isAnagram(String s, String t) { 
        int len= s.length();
        if(len != t.length()) return false;
        int charCount[]= new int[26];
        
        for(int i=0; i<len; i++){
            charCount[s.charAt(i)- 'a']++;
            charCount[t.charAt(i)- 'a']--;
        }
        for(int count: charCount)
            if(count != 0) return false;
        
        return true;       
    }
}
