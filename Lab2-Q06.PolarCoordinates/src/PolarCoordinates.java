public class PolarCoordinates {

	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double teta = Math.atan2(y, x);
		double r = Math.sqrt(x * x + y * y);

		System.out.println(r);
		System.out.println(teta);
	}
}