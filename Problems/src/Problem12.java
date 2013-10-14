public class Problem12 {

    public static int[] getSequenceOfTriangleNumbers(int numberOfSequence) {
        int[] sequence = new int[numberOfSequence + 1];
        sequence[0] = 0;
        for(int i = 1; i <= numberOfSequence; i++) {
            sequence[i] = i + sequence[i-1];
        }
        return sequence;
    }

    public static long getNumberOfDivisors(long number) {
        long numberOfDivisors=0;
        for (int i=1;i<=number/2;i++)
            if (number%i==0) numberOfDivisors++;
        numberOfDivisors++;
        return numberOfDivisors;
    }

    public static int highlyDivisibleTriangularNumber(int divisorsNumber, int numberOfSequence) {
        int[] sequence = getSequenceOfTriangleNumbers(numberOfSequence);
        for (Integer number : sequence) {
            if (getNumberOfDivisors(number) > divisorsNumber){
                return number;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        getSequenceOfTriangleNumbers(1000000000);
        System.out.println("done");
        long number = getNumberOfDivisors(322322322322L);
        System.out.println(""+number);
        //System.out.println("highlyDivisibleTriangularNumber (500) : " + highlyDivisibleTriangularNumber(500, 10000));
    }
}
