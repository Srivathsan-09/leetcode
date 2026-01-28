class Solution {
    public boolean isPalindrome(int x) 
    {
        int org = x;
        int sum = 0 ;
        while(x > 0)
        {
            int rem = x % 10 ;
            sum = sum*10 + rem;
            x = x/10;

        }
        if(org == sum)
        {
            return true;
        }
        else{
            return false;
        }
        
    }
}