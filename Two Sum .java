import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> number = new HashMap<>();
        
        //Contructing a hash map
        for(int i = 0 ; i < nums.length ; i ++)
        {
            number.put(nums[i] , i);
        }

        for(int i = 0 ; i <nums.length ; i ++)
        {
            int store = target - nums[i];
            if(number.containsKey(store) && number.get(store) != i)
            {
                return new int[]{i , number.get(store)};
            }
        }

        return new int[]{} ;
        
    }
}