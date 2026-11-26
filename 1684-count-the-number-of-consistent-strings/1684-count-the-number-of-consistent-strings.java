class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i = 0; i < words.length; i++ ){
            count++ ;
            for(int j = 0; j<words[i].length(); j++){
                int m ;
                for( m =0; m < allowed.length() ; m++ ){
                    if(words[i].charAt(j)==allowed.charAt(m)){
                        break;
                    }
                }
                if(m==allowed.length()){
                    count-- ;
                    break;
                }
            }
        }
        return count;
    }
}