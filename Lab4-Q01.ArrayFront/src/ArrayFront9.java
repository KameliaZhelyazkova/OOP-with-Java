public class ArrayFront9 {
	public static boolean arrayFront9(int[] nums) {
		for (int i = 0; i < nums.length && i < 4; i++) {// The array length may
														// be less than 4.											// Kude e posocheno tova
			if (nums[i] == 9) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int N = args.length;
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
		System.out.println(arrayFront9(nums));// zashto se slaga nums vutre
	}
}