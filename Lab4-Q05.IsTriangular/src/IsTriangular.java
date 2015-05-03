public class IsTriangular {
	public static boolean isTri(double a, double b, double c) {

		if (a < b + c && b < a + c && c < a + b) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// we use the Sedgewick & Wayne StdIn library to parse three double
		// values
		double a = StdIn.readDouble();
		double b = StdIn.readDouble();
		double c = StdIn.readDouble();

		if (isTri(a, b, c)) {
			System.out.printf(
					"%s,  %s and %s could be the lengths of a triangle\n", a,
					b, c);
		} else {
			System.out.println("Not a triangle.");
		}
	}
}
