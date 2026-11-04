class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for (i = 1; i < nums.length; i += 2) {
            if (nums[i - 1] != nums[i]) {
                break;
                
            }
        }
        return nums[i - 1];
    }
}