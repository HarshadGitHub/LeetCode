class PermutationInString {
    public boolean checkInclusion(String s2, String s1) {
        
        int[] charCount= new int[26];
        for(char ch: s2.toCharArray()){
            charCount[ch-'a']++;
        }
        
        int left=0;
        int right=0;
        int count= s2.length();
        
        while(right<s1.length()){
            if(charCount[s1.charAt(right++)-'a']-- >= 1)
                count--;
            if(count==0)
                return true;
            if(right-left==s2.length() && charCount[s1.charAt(left++)-'a']++ >=0)
                count++;
        }
        
        return false;
    }
}
