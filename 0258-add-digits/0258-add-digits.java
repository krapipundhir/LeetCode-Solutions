class Solution {
    public int addDigits(int num) {
        if(num==0)return 0;
        if(num<10)return num;
        String str=Integer.toString(num);
        while(str.length()>1){
            int res =0;
            char [] arr =str.toCharArray();
            for(int i=0;i<arr.length;i++){
                // arr[i]-'0';  It will Convert the 'char' into int.
                res+=arr[i]-'0';
            }
            str = Integer.toString(res);
        }        
    return Integer.parseInt(str);
    }
}
        
     