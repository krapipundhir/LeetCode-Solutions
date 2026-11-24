class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j = i+1; j<nums.length; j++ ){
                int multiple = (nums[i]-1)*(nums[j]-1);
                if(max<multiple){
                    max = multiple ;
                }
            }
        }
        return max;
    }
}