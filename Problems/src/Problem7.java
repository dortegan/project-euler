public class Problem7 {
	
	public static long getThe10001Prime(int primePosition) {
		int primeIndex = 0;
		int index = 2;
		while(true) {
			if (ProblemUtils.isPrime(index)) primeIndex++;
			if(primeIndex == primePosition) return index;
			index++;
		}
	}


	public static void main(String[] args) {
		System.out.println("6's prime: " + getThe10001Prime(6));
		System.out.println("10001's prime: " + getThe10001Prime(10001));
	}
}