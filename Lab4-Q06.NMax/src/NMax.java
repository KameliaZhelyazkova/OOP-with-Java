public class NMax {
	public static int max(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}

	public static double max(double a, double b, double c) {
		return Math.max(Math.max(a, b), c);
	}

	public static void main(String[] args) {
		// Use the method StdIn.readInt() to obtain input rather than
		// StdIn.readDouble().
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		int c = StdIn.readInt();

		int maximum = max(a, b, c);
		System.out.printf("Maximum value is: %s\n", maximum);
	}
}
