/**
 * Created with IntelliJ IDEA.
 * User: dortega
 * Date: 03-10-13
 * Time: 22:16
 * To change this template use File | Settings | File Templates.
 */
public class Problem4 {
    public static boolean isPalindrom(String number) {
        if (number.length() < 2) {
            return true;
        }
        for (int i = 0, j = number.length() - 1; i < number.length() / 2; i++, j--) {
            if (number.charAt(i) != number.charAt(j))
                return false;
        }
        return true;
    }

    public static String largestPalindrom() {
        int largestPalindrom = 9;
        int thei = 0;
        int thej = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int product = i * j;
                if (isPalindrom(String.valueOf(product)) && product > largestPalindrom) {
                    largestPalindrom = product;
                    thei = i;
                    thej = j;
                }
            }
        }
        return largestPalindrom + " - " + thei + " - " + thej;
    }

    public static void main(String[] args) {
        System.out.println(largestPalindrom());
    }
}
