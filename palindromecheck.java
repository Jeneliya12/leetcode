public class PalindromeCheck {
    public static void main(String[] args)
    {
        String str = "racecar";
        boolean isPalindrome = str.equals(new StringBuilder(str).reverse().toString());
        System.out.println("isPalindrome ? " + isPalindrome);
    }
}