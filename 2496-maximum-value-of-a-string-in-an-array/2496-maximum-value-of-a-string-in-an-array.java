class Solution {
    // Agar string sirf digits h to value = numeric value only
    // If String is alphanumeric then value = length.
    // It's the Whole point. of Question .
    public int maximumValue(String[] strs) {
        int max =0;
        int count = 0 ;
        for(int i =0; i<strs.length ; i++){
            count =0;
            for(int j =0; j< strs[i].length(); j++){
                char ch = strs[i].charAt(j) ;
                if(!Character.isDigit(ch)){
                    count = strs[i].length();
                    break;
                }
            }

            if(count== 0){
                count= Integer.parseInt(strs[i]) ;
            }
            // Pure digits string  → value = that real number
            // Alphanumeric/string → value = length
            if(max<count){
                max= count;
            }
        }
        return max;
    }
}
//For alphanumeric strings, value is equal to the string length.
// In this case, Leading zeros do not affect the result because length is used..

// Only there is an ecception for full digits string which are leading with 0.