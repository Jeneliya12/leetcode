public class maxandmin {
    public static void main (String [] args)
    {
        int[] nums = {5, 3, 7, 8, 2, 9};
        int min = Integer.MAX_VALUE; //2^31−1 = 2,147,483,647
        int max = Integer.MIN_VALUE; //−2^31 = −2,147,483,648
        
        for (int num : nums) 
        {
            if ( num < min ) min = num;
            if ( num > max) max = num;
        }
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
        
    }
}