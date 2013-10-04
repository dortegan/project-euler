/**
 * Created with IntelliJ IDEA.
 * User: dortega
 * Date: 03-10-13
 * Time: 22:16
 * To change this template use File | Settings | File Templates.
 */
public class Problem4 {
    public static int getDigits (int number, int i) {
        if(number == 0) {
            return i;
        }
        return getDigits(number / 10, ++i);
    }

    public boolean isPalindrom(int number) {
        if (number < 10) {
            return true;
        }
        int digits = getDigits(number, 0);
        int j = digits;

        //Esto es para que compile
        return false;
    }

    public static int largestPalindrom(int digits) {
        if(digits <= 1) {
            return 9;
        }
        return 1;
    }

    public static void main(String[] args) {
        int digits = getDigits(100, 0);
        System.out.println(digits);
    }
}
