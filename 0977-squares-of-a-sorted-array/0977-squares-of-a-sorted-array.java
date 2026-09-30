class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int[] result = new int[n];

        for(int i = n-1; i >= 0; i--){
            int val;

            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                val = nums[left];
                left++;
            }
            else{
                val = nums[right];
                right--;
            }
            result[i] = val * val;
        }
        return result;
    }
}