/**
 * Created with IntelliJ IDEA.
 * User: dortega
 * Date: 03-10-13
 * Time: 22:16
 * To change this template use File | Settings | File Templates.
 */
public class Problem3 {
    //TODO: Try the recursive solution
    public static long largestPrime(long number) {
        if (number <= 1) {
            return number;
        }
        int factor = 2;
        int largestFactor = factor;
        while(true) {
            if(factor <= number) {
                if (number % factor == 0) {
                    number = number / factor;
                    largestFactor = factor;
                } else {
                    factor ++;
                }
            } else {
                break;
            }

        }
        return largestFactor;
    }
    public static void main(String[] args) {
        long largestPrime = largestPrime(600851475143L);
        System.out.println(largestPrime);
    }
}
