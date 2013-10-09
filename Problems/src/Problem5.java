public class Problem5 {
	public static int getSmallestNumber(int startNumber, int minDivisor, int maxDivisor) {
		int number = startNumber;
		while (true) {
			for(int i = minDivisor; i <= maxDivisor; i++) {
				if(number % i == 0) {
					if(i == maxDivisor) {
						return number;
					}
				} else {
					break;
				}
			}
			number++;
		}
	}

	public static void main(String[] args) {
		System.out.println("Smallest number: " + getSmallestNumber(1, 1, 10));
		System.out.println("Smallest number: " + getSmallestNumber(2520, 11, 20));
	}
}