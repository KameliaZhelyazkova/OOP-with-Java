public class NoTriples {
	public static boolean noTriples(int[] nums) {
//		int count = 0;
//		int secondVarible = 0;
//		int thirdVariable = 0;
//		for (int i = 0; i < nums.length - 2; i++) {
//			count = nums[i];
//			secondVarible = nums[i + 1];
//			thirdVariable = nums[i + 2];
//			if (count == secondVarible && count == thirdVariable) {
//				return false;
//			}
//		}
//		return true;
		 
		//Second way of doing it, which was my initial thougth
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == nums [i + 1] && nums[i] == nums[i + 2]){
				return false; 
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		int[] nums = new int[args.length];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
		System.out.println(noTriples(nums));
	}
}
