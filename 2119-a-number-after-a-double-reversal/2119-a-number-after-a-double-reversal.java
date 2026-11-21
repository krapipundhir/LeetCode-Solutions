class Solution {
    public boolean isSameAfterReversals(int num) {
        // This single line enough to solve this ques .
        // We can use this one single line of code .
        // **return num == 0 || num % 10 != 0;***
        int orginal = num;
        int reversed =0 ;
        while(num !=0){
            reversed= 10*reversed + num%10;
            num = num/10;
        }
        int doubleReversed = 0;
        while(reversed!=0){
            doubleReversed= doubleReversed*10 + reversed%10;
            reversed/=10;
        }
        return doubleReversed==orginal;
    }
}