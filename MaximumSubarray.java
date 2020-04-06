  // KADANE ALGO 
  
   public int maxSubArray(int[] nums) {
        int max =  Integer.MIN_VALUE;
        int min = 0;
        for(int i = 0;i<nums.length;i++){
            
            min = min +nums[i];
            
        if (min<nums[i]){
                min=nums[i];
            }
            if (max<min){
                max = min;
            }

            
        }
        return max;  
    }
	
