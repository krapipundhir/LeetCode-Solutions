class Solution {
    
    public static String[] keyPad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        
        if (digits.length() == 0) {
            return ans;
        }
        
        printCombination(digits, 0, "", ans);
        
        return ans;
    }

    public static void printCombination(String digits, int idx, String combination, List<String> ans) {

        if (idx == digits.length()) {
            ans.add(combination);
            return;
        }

        char current = digits.charAt(idx);
        String map = keyPad[current - '0'];

        for (int i = 0; i < map.length(); i++) {
            printCombination(digits, idx + 1, combination + map.charAt(i), ans);

        }
        
    }
}