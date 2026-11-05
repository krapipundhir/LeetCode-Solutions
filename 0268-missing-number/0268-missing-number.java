class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length==0){
            return 0 ;
        }
        Arrays.sort(nums);
        
        if(nums[0] != 0){
            return 0;
        }
        int ans =nums.length;
        for(int i=1; i <nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                ans =nums[i-1]+1;
                break;
            }
        }
        return ans;
    }
}