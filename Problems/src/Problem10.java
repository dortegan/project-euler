public class Problem10 {

    public static long sumOfPrimes(int maxIterNumber) {
        long sumOfPrimes = 0;
        for (int i = 2; i < maxIterNumber; i++) {
            if (ProblemUtils.isPrime(i)) {
                sumOfPrimes += i;
            }
        }
        return sumOfPrimes;
    }


    public static void main(String[] args) {
        System.out.println("6 first primes sum: " + sumOfPrimes(10));
        System.out.println("2000000 first primes sum: " + sumOfPrimes(2000000));
    }
}
