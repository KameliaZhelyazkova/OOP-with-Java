import java.util.Arrays;

public class Mode {

	public static void main(String[] args) {
		int n = args.length;
		int[] dataset = new int[n];

		for (int i = 0; i < n; i++) {
			dataset[i] = Integer.parseInt(args[i]);
		}

		int[] count = new int[10];
		for (int i = 0; i < n; i++) {
			int element = dataset[i];
			count[element] += 1;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.print("[" + i + "s: " + count[i] + "]");
			if (count[i] > 0) {
				System.out.print(" ");
				for (int j = 0; j < count[i]; j++) {
					System.out.print(".");
				}
			}
			System.out.print("\n");
		}
		int currentLargestOccurance = 0;
		int currentValue = 0; 
		for (int i = 0; i < count.length; i++) {
			if (count[i] > currentLargestOccurance) {
				currentLargestOccurance = count[i];
				currentValue = i; 
			}	
		}
		System.out.println("Mode: " + currentValue);	
	}
}