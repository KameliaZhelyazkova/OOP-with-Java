public class Distance2 {

	public static void main(String[] args) {
		Distance2(args);
	}

	public static void Distance2(String[] args) {
		int firtsInteger = Integer.parseInt(args[0]);
		int secondInteger = Integer.parseInt(args[1]);
		System.out.println(Math.abs(firtsInteger - secondInteger));
	}
}