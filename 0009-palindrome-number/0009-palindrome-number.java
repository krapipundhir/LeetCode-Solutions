class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String str=Integer.toString(x);
        String rev ="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            return true;
        }
        else
            return false;
        
    }
}