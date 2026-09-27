class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        char[] charS =s.toCharArray();
        int count=0;
        for(int i=charS.length-1;i>=0;i--){
            if(charS[i]!=' ')
            count++;
            else
            break;
            }   
        return count;
    }
}