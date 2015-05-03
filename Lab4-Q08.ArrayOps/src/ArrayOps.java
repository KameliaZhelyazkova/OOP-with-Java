import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOps {
	public static double findMax(double[] data) {
		double localMaximum = 0;
		double globalMaximum = data[0];

		// if (data.length == 1) {
		// return globalMaximum;
		// } else {
		for (int i = 0; i < data.length - 1; i++) {
			localMaximum = Math.max(data[i], data[i + 1]);
			if (localMaximum >= globalMaximum) {
				globalMaximum = localMaximum;
			}
		}
		// }
		return globalMaximum;
	}

	// A bit faster solution:
	// double max = data[0];
	// for (int i = 1; i < data.length; i++) {
	// if (data[i] > max) {
	// max = data[i];
	// }
	// }
	// return max;
	// }

	public static double[] normalise(double data[]) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}

		double[] newArray = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i] / sum;
		}
		return newArray;
	}

	public static void normaliseInPlace(double data[]) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		for (int i = 0; i < data.length; i++) {
			data[i] /= sum;
		}
	}

	public static double[] reverse(double[] data) {
		double[] reversedArray = new double[data.length];

		for (int i = 0; i < data.length; i++) {
			reversedArray[data.length - 1 - i] = data[i];
			// reversedArray[i] = data[data.length - 1 - i];
		}
		return reversedArray;
	}

	public static void reverseInPlace(double[] data) {
		for (int i = 0; i < data.length / 2; i++) {
			double temp = data[i];
			data[i] = data[data.length - 1 - i];
			data[data.length - 1 - i] = temp;
		}
	}

	public static void swap(double[] data1, double[] data2) {
		for (int i = 0; i < data2.length; i++) {
			double tempSecArray = data2[i];
			data2[i] = data1[i];
			data1[i] = tempSecArray;
		}
	}

	public static void main(String[] args) {
		double[] data = new double[args.length];

		for (int i = 0; i < data.length; i++) {
			data[i] = Double.parseDouble(args[i]);
		}
		System.out.println(Arrays.toString(data));
		System.out.println(ArrayOps.findMax(data));
		System.out.println(Arrays.toString(ArrayOps.normalise(data)));
	}

}