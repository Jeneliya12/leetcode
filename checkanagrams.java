//replace the whitespace and convert strings into lowercase
//check both the strings are equal in length
//convert the strings into char array
//sort the char array
//check if teh sorted char arrys are equal to each other
import java.util.Arrays;
public class checkanagrams{
    public static boolean areAnagrams(String str1, String str2)
    {
        str1 = str1.replace("\\s", " ").toLowerCase();
        str2 = str2.replace("\\s", " ").toLowerCase();
    
        if ( str1.length() != str2.length())
        {
            return false;
        }
        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args)
    {
        String str1 = "cinema";
        String str2 = "iceman";
        
        if(areAnagrams(str1, str2))
        {
            System.out.println(str1 + " and " + str2 + " are Anagrams" );
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not Anagrams" );
        }
    }
}