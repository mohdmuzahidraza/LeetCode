class Solution {
    public boolean numberHasEventDigits(int num){
        int count = 0;
        while(num !=0){
            num = num / 10;
            count ++;
        }
        return count % 2 == 0;
    }
    public int findNumbers(int[] nums) {
        int event = 0;
        for(int i = 0; i < nums.length; i++){
            if(numberHasEventDigits(nums[i])){
                event++;
            }
        }
        return event;
    }
}