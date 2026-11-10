class Solution {
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        String vowels = "aeiouAEIOU"; 
        for(int i = 0, j = arr.length-1; i<j;){
            boolean isLeftVowel = vowels.indexOf(arr[i])!=-1 ;
            boolean isRightVowel = vowels.indexOf(arr[j])!=-1;
            if(isLeftVowel && isRightVowel ){
                char temp = arr [i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++ ;
                j-- ;
            }
            else if (!isLeftVowel) {
               i++; 
            }
            else {
                j--;
            }
        }
        return new String(arr);
    }
}