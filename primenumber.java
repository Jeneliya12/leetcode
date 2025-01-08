public class primenumber{
    public static void main(String[] args)
    {
        int num = 11;
        
        if(isPrime(num))
        {
            System.out.println(num + " it's a prime number ");
        }
        else {
            System.out.println(num + " it's not a prime number ");
        }
    }
    
    public static boolean isPrime(int num)
    {
        if (num<=1)
        {
            return false;
        }
        for (int i=2; i<=Math.sqrt(num); i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}