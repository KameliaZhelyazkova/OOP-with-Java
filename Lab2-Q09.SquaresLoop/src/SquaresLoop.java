import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class SquaresLoop {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for (int j = 0; j < array.length; j++) {
			array[j] = array[j] * array[j];
		}
		
		for (int k = 0; k < array.length; k++){
			System.out.print(array[k] + " ");
		}
		System.out.println();
	}
}
