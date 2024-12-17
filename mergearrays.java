import java.util.Arrays;
public class MergeArrays {
    public static void main (String[] args)
    {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        
        int length1 = array1.length; //3
        int length2 = array2.length; //3
        
        int[] mergedArray = new int[length1+length2]; //6
        
        for (int i=0; i<array1.length; i++) 
        {
            mergedArray[i] = array1[i]; 
        }
        for (int i=0; i<array2.length; i++)
        {
            mergedArray[length1 + i ] = array2[i];
        }
      System.out.println(Arrays.toString(mergedArray));
    }
}