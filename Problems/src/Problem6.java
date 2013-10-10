public class Problem6 {
	public static long squareSum(int number) {
		long total = 0;
		for (int i = 1; i <= number; i++) {
			total += i;
		}
		return (long)Math.pow(total,2);
	}

	public static long sumOfSquares(int number) {
		long total = 0;
		for (int i = 1; i <= number; i++) {
			total += Math.pow(i,2);
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println("Respuesta 10: " + (squareSum(10) - sumOfSquares(10)));
		System.out.println("Respuesta 100: " + (squareSum(100) - sumOfSquares(100)));
	}
}