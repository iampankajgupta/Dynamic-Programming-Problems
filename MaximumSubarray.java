  // KADANE ALGO 

// IT WORKS FOR POSITIVE AND NEGATIVE NUMBER 

// FIND THE MAXIMUM CONTINOUS ELEMENTS WHICH ADD UPTO MAXIMUM SUM 


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
	
TEST CASE 

1. [-2,1,-3,4,-1,2,1,-5,4];

