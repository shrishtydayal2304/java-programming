class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>hashmap = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int sum = target -nums[i];

            if(hashmap.containsKey(sum))
            { 
                return new int [] {hashmap.get(sum),i};
        }
        hashmap.put(nums[i],i);
    
        }
    throw new IllegalArgumentException("no result found");
        
    }
}


