public class Problem28 {

    public static long getDiagonalsSum(int n) {
        long suma = 1;
        int counter = 1;
        int factor = 0;
        for (int i = 1; i < Math.pow(n, 2);) {
            i = i + (2*factor+2);
            suma = suma + i;
            counter ++;
            if (counter > 4) {
                counter = 1;
                factor ++;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Suma: " + getDiagonalsSum(1001));
    }
}
