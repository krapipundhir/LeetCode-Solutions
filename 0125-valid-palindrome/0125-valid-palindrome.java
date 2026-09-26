class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(s.isEmpty()) return true;
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }else{
            return false;
        }
        
    }
}