public class negativenumber {
    public static void main (String[] args)
    {
        int[] nums = {1, -2, 4, 6, -3, 7, -5};
        int j = 0; //pointer for the negative NegativeNumbers
        
           for(int i=0; i < nums.length; i++)
            {
                if (nums[i] < 0)
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            } 
            
            for (int num : nums){
                 System.out.print(num + " ");
              }
        }
}
