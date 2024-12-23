public class MissingNumber {
    public static void main(String[] args)
   {
       int[] nums = {1, 2, 3, 4};
       int n= 5;
       
       int missingNumber = findMissing(nums, n);
       
       System.out.println("The missing number is: " + missingNumber);
   }
   
   public static int findMissing(int[] nums, int n)
   {
       int totalSum = n* (n+1)/2; 
       
       int arraySum = 0;
       
       for(int num: nums)
       {
           arraySum += num;
       }
       return totalSum - arraySum;
       
   }
    
}
