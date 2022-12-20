class Solution { 
     public int findDuplicate(int[] nums) { 
         for (int i = 0; i < nums.length; i++) { 
           int cur = nums[i]; 
           if (cur < 0) { 
              cur = -cur; 
           } 
           if (nums[cur] < 0) { 
             return cur; 
           } 
           else { 
                 nums[cur] *= -1; 
                } 
           } 
                  
           return 0; 
     } 
 }
