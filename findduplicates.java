import java.util.HashSet;

public class findduplicates {
    public static void main (String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 3, 4};
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Duplicates:");
        
        for (int nums: arr)
        {
            if(!set.add(nums))
            {
                System.out.println(nums + " ");
            }
        }
    }
}