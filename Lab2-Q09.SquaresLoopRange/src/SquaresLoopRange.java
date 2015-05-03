public class SquaresLoopRange {

	public static void main(String[] args) {
		int startNumber = Integer.parseInt(args[0]);
		int stopNumber = Integer.parseInt(args[1]);

		if (startNumber <= stopNumber) {
			for (int i = startNumber; i <= stopNumber; i++) {
				System.out.print(i*i + " ");
			}		
		} else if (startNumber > stopNumber) {
			System.out.println("Start-limit greater than stop-limit!");
		}
	}
}