public class Problem7 {
	
	public static boolean isPrime(int number) {
		if (number > 1 && number < 4) return true;
		int factors = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors++;
			}
			if (factors > 2) return false;
		}
		return true;
	}

	public static long getThe10001Prime(int primePosition) {
		int primeIndex = 0;
		int index = 2;
		while(true) {
			if (isPrime(index)) primeIndex++;
			if(primeIndex == primePosition) return index;
			index++;
		}
	}


	public static void main(String[] args) {
		/*for (int i = 2; i < 20 ; i++) {
			System.out.println("isPrime "+i+" : " + isPrime(i));	
		}*/
		System.out.println("6's prime: " + getThe10001Prime(6));
		System.out.println("10001's prime: " + getThe10001Prime(10001));
	}
}