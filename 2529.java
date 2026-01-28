class Solution {
    public int maximumCount(int[] nums) 
    {
        int n = nums.length ; 
        int poscount = 0 ;
        int negcount = 0 ;
        for(int i = 0 ; i < n ; i ++)
        {
            if(nums[i] > 0)
            {
                poscount ++;
            }
            else if(nums[i] ==0)
            {
                continue;
            }
            else
            {
                negcount ++;
            }
        }
        if( poscount>negcount)
        {
            return poscount;
        }
        else
        {
            return negcount;
        }
        
    }
}