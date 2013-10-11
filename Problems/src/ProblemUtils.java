public class ProblemUtils {

	public static boolean isPrime(int number) {
        if (number % 2 == 0 && number > 2) return false;
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}