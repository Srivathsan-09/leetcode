class Solution {
    public int[] plusOne(int[] digits) 
    {
        int n = digits.length;
        //If less than 9
        for( int i = digits.length - 1 ; i >= 0 ; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            //If it is 9
            digits[i] = 0;
            
        }
        
        //If all numbers were 9

        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result ;
        
    }
}