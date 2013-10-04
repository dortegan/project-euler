/**
 * Created with IntelliJ IDEA.
 * User: dortega
 * Date: 01-10-13
 * Time: 21:22
 * To change this template use File | Settings | File Templates.
 */
public class Problem1 {
    public static void main (String[] args) {
        int suma = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }
        System.out.println("suma: " + suma);
    }
}
