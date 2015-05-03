public class Multiplier {

	public static void main(String[] args) {

		int firstInteger = Integer.parseInt(args[0]);
		int secondInteger = Integer.parseInt(args[1]);
		int thirdInteger = Integer.parseInt(args[2]);
		int product = firstInteger * secondInteger * thirdInteger;
		System.out.println(firstInteger + " * " + secondInteger + " * "
				+ thirdInteger + " = " + product);
		//System.out.printf("%d * %d * %d = %d%n", firstInteger, secondInteger,
		//		thirdInteger, product);
	}
}
