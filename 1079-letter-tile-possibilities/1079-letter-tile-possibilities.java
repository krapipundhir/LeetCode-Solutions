class Solution {
    public int numTilePossibilities(String tiles) {
        
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);
        String sortedTile= new String(chars);
        return permutationOfString( sortedTile, "" );


    }
    
    public int permutationOfString(String tiles, String solution ){
        int count = solution.length() >0 ?1:0;
        for(int i = 0; i <tiles.length() ; i++ ){
            char currChar= tiles.charAt(i);

            if(i>0 && tiles.charAt(i)==tiles.charAt(i-1)){
                continue;
            }
            String newString =  tiles.substring(0,i)+tiles.substring(i+1);
            count += permutationOfString(newString, solution+currChar );
        }
        return count;
    }
}