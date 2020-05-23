class RomanToInteger {
    
    final Map<Character,Integer> values = Map.of(
    'I',1,
    'V',5,
    'X',10,
    'L',50,
    'C',100,
    'D',500,
    'M',1000
    );
    
    public int romanToInt(String input) {
        
    int retVal = 0;
    int limit = input.length();
    int prevVal = 0;
    int nextVal = 0;
    for(int i = limit - 1;i >= 0; --i){
        char nextChar = input.charAt(i);
        prevVal = nextVal;
        nextVal = values.get(nextChar);
        if(nextVal < prevVal){
            retVal -= nextVal;
        }else{
            retVal += nextVal;
        }
    }
    return retVal; 
    }
}
