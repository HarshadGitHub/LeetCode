class StrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        int hlen= haystack.length();
        int nlen= needle.length();
        if(hlen< nlen) return -1;
        for(int i=0; i<=hlen-nlen; i++){
            int j;
            for(j=0; j<nlen; j++){
                if(haystack.charAt(i+j) != needle.charAt(j))
                    break;
            }
            if(j == nlen)return i;
        }
        return -1;
    }
}
