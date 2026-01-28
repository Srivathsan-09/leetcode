class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int n = nums.length;
        // [1 , 3 , 5 , 6]
        int index = 0;
        for(int i = 0 ; i < n ; i ++)
        {
            if(nums[i] == target)
            {
                
                return i;
            }
            // [1 , 3 , 5 , 6] target =2
            if(nums[i] > target)
            {
                return i;
            }
        }
        return n ;
        
    }
}