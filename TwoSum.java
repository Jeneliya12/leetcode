public class TwoSum
{
    public static int[] findTwoSum(int[] nums, int target)
    {
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Numbers Found");
    }
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        
        int[] result = findTwoSum(nums, target);
        System.out.println("The indexes of two nums are: [ " + result[0] + " , " + result[1] + " ] ");
    }
}