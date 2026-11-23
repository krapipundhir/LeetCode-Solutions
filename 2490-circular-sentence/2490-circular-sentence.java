class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] wordsArr= sentence.split(" ");
        for(int i=0; i<wordsArr.length-1; i++){
            char last = wordsArr[i].charAt(wordsArr[i].length()-1);
            char first=wordsArr[i+1].charAt(0);
            if(last!=first){
                return false;
            }
        }
        String lastWord =wordsArr[wordsArr.length-1];
        char lastCharOfLastWordOf = lastWord.charAt(lastWord.length()-1);
        String firstWord=wordsArr[0];
        char FirstCharOfFirstWord = firstWord.charAt(0);
        if(lastCharOfLastWordOf == FirstCharOfFirstWord ){
            return true;
        }
        return false;
        // return lastCharOfLastWordOf==FirstCharOfFirstWord
        // It will also work at  the place of nested if condition beacuse our function is Boolean.
        // It will return Boolean true or false .
    }
}