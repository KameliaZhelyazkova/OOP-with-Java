import java.util.Arrays;

public class TempMedian {
	public static void main(String[] args) {

		int n = args.length;
		int[] temperatureSet = new int[n];

		temperatureSet[0] = Integer.parseInt(args[0]);// Because only the first
														// element is an
														// integer.

		// 1. Converting a sequence of command-line arguments into an array of
		// temperature values.
		for (int i = 1; i < n; i++) {
			String c = args[i];
			if (c.equals(".")) {
				temperatureSet[i] = temperatureSet[i - 1]; // Because we start
															// counting from 0
			}
			if (c.equals("+")) {
				temperatureSet[i] = temperatureSet[i - 1] + 1; // Previous
																// element,
																// which is
																// guaranteed to
																// be
																// number
			}
			if (c.equals("-")) {
				temperatureSet[i] = temperatureSet[i - 1] - 1;
			}
		}
		// Print out raw temp data:
		System.out.print(temperatureSet[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + temperatureSet[i]);// We put space before
														// temperatureSet,
														// because there is an
														// element before it.
		}
		System.out.print("\n");

		// 2.Sorting this array.
		Arrays.sort(temperatureSet);

		System.out.print(temperatureSet[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + temperatureSet[i]);// We put space before
														// temperatureSet,
														// because there is an
														// element before it.
		}
		System.out.print("\n");

		// 3.Calculating the median of the array.

		double median = 0;
		if (n % 2 == 0) {
			median = ((float)temperatureSet[n / 2] + (float)temperatureSet[n / 2 + 1]) / 2.0;
		}
		if (n % 2 != 0) {
			median = temperatureSet[n / 2];
		}

		System.out.println(median);
	}
//	double median;
//    if (temperatureSet.length % 2 == 1) {
//        // Array has odd number of elements
//        median = temperatureSet[(n + 1) / 2 - 1];//??
//    }
//    else {
//        // Array has even number of elements
//        median = (temperatureSet[n / 2] + temperatureSet[n / 2 - 1]) / 2.0;//??
//    }
//
//    System.out.println(median);
//
//}
}
