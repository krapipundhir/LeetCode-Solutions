class Solution {
    public int climbStairs(int n) {
        int prev =1;
        int prev1= 2;
        if(n==2)return prev1;
        if(n==1)return prev;
        if(n==0) return n;
        int current =  0;
        for(int i =3;i<=n; i++){
            current =  prev + prev1;
            prev=prev1;
            prev1  = current;
            
        }
        return prev1;
    }
}