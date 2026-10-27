class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0 ){
            return false;
        }
        else{
            Stack<Character> stackk =new Stack <>();
            for(int i= 0; i < s.length(); i++ ){
                char ch =s.charAt(i);
                if(ch =='(' || ch =='['||ch =='{'){
                    stackk.push(ch) ;
                }
                else{
                    if(stackk.isEmpty())
                        return false;
                
                    char top = stackk.peek();

                    if ((ch == ')' && top == '(') ||
                    (ch == ']' && top == '[') ||
                    (ch == '}' && top == '{')) {

                        stackk.pop();
                    }
                    else{
                    
                        return false;
                    }
                }
            }
            return stackk.isEmpty();
        }
        
            
        
    }
}