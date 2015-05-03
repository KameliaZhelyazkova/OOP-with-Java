public class BooleanExpr {

	public static void main(String[] args) {
		boolean myFirstBoolean = Boolean.parseBoolean(args[0]);
		boolean mySecondBoolean = Boolean.parseBoolean(args[1]);
		boolean phi = !(myFirstBoolean && mySecondBoolean)
				&& (myFirstBoolean || mySecondBoolean)
				|| (myFirstBoolean && mySecondBoolean)
				|| !(myFirstBoolean || mySecondBoolean);
		System.out.println("a: " + myFirstBoolean);
		System.out.println("b: " + mySecondBoolean);
		System.out.println("phi: " + phi);
	}
}