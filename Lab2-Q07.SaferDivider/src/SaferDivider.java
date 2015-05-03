public class SaferDivider {

	public static void main(String[] args) {
		float firstFloatingPoint = Float.parseFloat(args[0]);
		float secondFloatingPoint = Float.parseFloat(args[1]);

		if (secondFloatingPoint > 0) {
			System.out.println(firstFloatingPoint / secondFloatingPoint);
		} else if (secondFloatingPoint == 0) {
			System.out.println("I can't divide by zero!");
		}

	}
}