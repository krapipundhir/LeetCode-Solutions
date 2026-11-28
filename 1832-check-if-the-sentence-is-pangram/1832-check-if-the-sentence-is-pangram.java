class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26 ){
            return false;
        }
        for(char target='a'; target<='z';target++ ){
            boolean found = false ; 
            for(int i = 0; i < sentence.length();i++){
                if(sentence.charAt(i)== target){
                    found = true;
                    break ;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;

    }
}