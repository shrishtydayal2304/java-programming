class Solution {
    public void rotate(int[] nums, int k) {
        int temp [] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            temp[(k+i)%nums.length] = nums[i];
              
                  }
         for(int i=0;i<nums.length;i++)
         {
       // copying back the roated array to the original array .ie in nums[]
            
        nums[i]=temp[i];
         }
         }}
