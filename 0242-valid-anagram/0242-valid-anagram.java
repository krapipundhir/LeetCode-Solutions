class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        s=s.toLowerCase();
        t=t.toLowerCase();
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        Arrays.sort(arrayS);
        Arrays.sort(arrayT);
        if(Arrays.equals(arrayS,arrayT)){
            return true;
        }
        return false;
            
    }
}