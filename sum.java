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


//The java.util.HashMap.get() method of HashMap class is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. 
//It returns NULL when the map contains no such mapping for the key


//put() method of HashMap is used to insert a mapping into a map.
//If an existing key is passed then the previous value gets replaced by the new value. If a new pair is passed, then the pair gets inserted as a whole. 


