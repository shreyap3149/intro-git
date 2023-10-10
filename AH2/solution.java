
public class solution

{

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args)

    {
        int number = 5;
        if (isPrime(number)) {
            System.out.println("This is a prime number: " + number);
        } else {
            System.out.println("This is not a prime number: " + number);
        }

    }

}