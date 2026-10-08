class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Integer[] ans = new Integer[nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
        }
        
        Arrays.sort(ans, (val1, val2) -> Integer.compare(val1 % 2, val2 % 2));
        for(int i = 0; i < nums.length; i++){
            nums[i] = ans[i];
        }
        return nums;
    }
}