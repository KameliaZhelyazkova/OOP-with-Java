public class SaferQuadraticSolver {

	public static void main(String[] args) {
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float c = Float.parseFloat(args[2]);
		float diterminant = (b * b) - 4 * a * c;

		if (a == 0){
			System.out.println("A = 0. Cannot solve equation.");
		}
		else if(a != 0) {
			if (diterminant > 0) {
					System.out.println((-b + (float) Math.sqrt(diterminant))
							/ 2 * a);
					System.out.println((-b - (float) Math.sqrt(diterminant))
							/ 2 * a);
			} else if (diterminant < 0) {
				System.out.println("Equation is not solvable for real x.");
			} else if (diterminant == 0) {
				double numberX = ((-b) / 2 * a);
				System.out.println(numberX);
				System.out.println(numberX);
			}
		}
	}
}