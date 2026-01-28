class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int n = nums.length;
         
        int index= 1;
        // 0 0 1 1 1 2 2 3 3 4
        for(int i = 1 ; i < n ; i ++)
        {
            if(nums[i] != nums[i-1])
            {
                nums[index] = nums[i];
                index++;
                    
            }
        }
        return index;
    }
}