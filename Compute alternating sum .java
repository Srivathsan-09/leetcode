class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        //[1 , 3 , 5 , 7]
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];   
            } else {
                sum -= nums[i];   
            }
        }

        return sum;
    }
}