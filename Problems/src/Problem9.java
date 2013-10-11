public class Problem9 {

    public static int findPithagorearTripletProduct(int sumNumber) {
        double hypotenuse = 0;
        double squareSum = 0;
        int j = 2;
        for (int i = 1; i < sumNumber; i++) {
            while (j < sumNumber) {
                 squareSum = Math.pow(i, 2) + Math.pow(j, 2);
                 hypotenuse = Math.sqrt(squareSum);
                 if(hypotenuse % 1 == 0 && hypotenuse > j && (i + j + hypotenuse == sumNumber)) {
                     return i * j * (int)hypotenuse;
                 }
                 j++;
            }
            j = i + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("findPithagorearTripletProduct 3*4*5: " + findPithagorearTripletProduct(12));
        System.out.println("findPithagorearTripletProduct where a+b+c = 1000 : " + findPithagorearTripletProduct(1000));
    }
}
