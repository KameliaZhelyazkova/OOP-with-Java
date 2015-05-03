public class QuadraticSolver {

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double discriminat = b * b - 4 * a * c;

		if (discriminat > 0) {
			double firstNumberX = (-1 * b + (double) Math.sqrt(discriminat))
					/ 2 * a;
			double secondNumberX = (-1 * b - (double) Math.sqrt(discriminat))
					/ 2 * a;
			System.out.println(firstNumberX);
			System.out.println(secondNumberX);
		} else if (discriminat == 0) {
			double numberX = ((-b) / 2 * a);
			System.out.println(numberX);
			System.out.println(numberX);
		} // else {
			// System.out.println("NDA");
		// }
	}
}