//258. Add Digits
public class adddigits {
    public static void main (String[] args){
        int num = 38;
        
        int result = addDigits(num);
        
        System.out.println("The result of adding digits of " + num + " is " + result);
    }

    public static int addDigits(int num)
    {
        if (num == 0) return 0;
        return 1 + (num -1) % 9;
    }
} 