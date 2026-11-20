class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    //     int orginal = num;
    //     int reversed =0 ;
    //     while(num !=0){
    //         reversed= 10*reversed + num%10;
    //         num = num/10;
    //     }

        

    //     return reversed==orginal;
    }
}