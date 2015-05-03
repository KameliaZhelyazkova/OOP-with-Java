public class MultiplesLoopRange {

	public static void main(String[] args) {

		int lower = Integer.parseInt(args[0]);
		int upper = Integer.parseInt(args[1]);
		int multiple = Integer.parseInt(args[2]);

		if (lower <= upper) {
			for (int i = lower; i <= upper; i++) {
				if (i % multiple == 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			for (int i = lower; i >= upper; i--) {
				if (i % multiple == 0) {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println();

	}
}
