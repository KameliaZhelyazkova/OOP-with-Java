import java.awt.RadialGradientPaint;
import java.util.Arrays;
import java.util.SortedMap;

import javax.lang.model.element.VariableElement;

public class Rearrangement {

	public static int dotWith(int[] a, int[] b) {

		if (a.length == b.length) {
			int kerfuffle = 0;
			for (int i = 0; i < b.length; i++) {
				kerfuffle += a[i] * b[i];
			}
			return kerfuffle;
		} else {
			return 0;
		}
	}

	public static void rotate(int[] b) {

		// b = new int[] { 1, 2, 3};

		int[] copyArray = b.clone();

		for (int i = 0; i < b.length; i++) {
			if (i > 0) {
				b[i] = copyArray[i - 1];
			}
			if (i == b.length - 1) {
				b[0] = copyArray[copyArray.length - 1];
			}
		}
	}

	public static int useRotations(int[] a, int[] b) {
		if (a.length == b.length) {
			int currentMaxValue = 0;
			int absoluteMaxValue = 0;
			for (int i = 0; i < b.length; i++) {
				currentMaxValue = Rearrangement.dotWith(a, b);
				if (currentMaxValue > absoluteMaxValue) {
					absoluteMaxValue = currentMaxValue;
				}
				rotate(b);
			}
			return absoluteMaxValue;
		} else {
			return 0;
		}

	}

	public static int[] sorting(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int tempVar = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tempVar;
				}
			}
		}
		return numbers;
	}

	public static int useSorted(int[] a, int[] b) {
		if (a.length == b.length) {
			return Rearrangement.dotWith(Rearrangement.sorting(a),
					Rearrangement.sorting(b));
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int arrayLength = Integer.parseInt(args[0]);

		int[] firstArray = new int[arrayLength];
		int[] secondArray = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			firstArray[i] = Integer.parseInt(args[i + 1]);
			secondArray[i] = Integer.parseInt(args[arrayLength + i + 1]);
		}

		int resultFromDotWith = Rearrangement.dotWith(firstArray, secondArray);
		System.out.printf("dotWith gave: %s", resultFromDotWith);
		System.out.println();

		int resultFromUseRotations = Rearrangement.useRotations(firstArray,
				secondArray);
		System.out.printf("useRotations gave: %s", resultFromUseRotations);
		System.out.println();

		int resultFromUseSorted = Rearrangement.useSorted(firstArray,
				secondArray);
		System.out.printf("useSorted gave: %s", resultFromUseSorted);

	}
}
