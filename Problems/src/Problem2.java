import sun.security.util.BigInt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dortega
 * Date: 01-10-13
 * Time: 21:46
 * To change this template use File | Settings | File Templates.
 */
public class Problem2 {

    public static int[] fibonacci(int n) {
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static void main(String[] args) {
        int suma = 0;
        for (int num : fibonacci(4000000)) {
            //System.out.println(num);
            if (num <= 4000000) {
                if (num % 2 == 0) {
                    suma += num;
                }
            } else {
                break;
            }
        }
        System.out.print(suma);
    }
}
