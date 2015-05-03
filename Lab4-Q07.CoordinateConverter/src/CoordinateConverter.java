public class CoordinateConverter {
	public static double convertXYtoR(double x, double y) {// po vreme na
															// izpisvaneto na
															// metoda s
															// skobite() tam li
															// zadavame
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public static double convertXYtoT(double x, double y) {

		return Math.atan2(y, x);
	}

	public static double convertRTtoX(double r, double theta) {
		double x = r * Math.cos(theta);
		return x;
		// double x = Math.sqrt(Math.pow(r, 2) * Math.pow(Math.cos(theta), 2));
		// return x;
	}

	public static double convertRTtoY(double r, double theta) {
		double y = r * Math.sin(theta);
		// double y = Math.sqrt((Math.pow(r, 2) * Math.pow((Math.sin(theta)),
		// 2)));
		return y;
	}

	public static double convertDegToRad(double deg) {
		double rad = (deg * Math.PI) / 180;
		return rad;
	}

	public static double convertRadToDeg(double rad) {
		double deg = (rad * 180) / Math.PI;
		return deg;
	}

	public static void method(String args) {
		if (args == null) {
			return;
		}

		boolean isMagic = true;
		int myAge = isMagic ? 18 : 21;
	}

	// public static void main(String[] args) {
	// double x = Double.parseDouble(args[0]);
	// double y = Double.parseDouble(args[1]);
	// }

}
