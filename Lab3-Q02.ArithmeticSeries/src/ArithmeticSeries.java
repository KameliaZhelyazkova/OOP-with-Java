import javax.xml.bind.ParseConversionEvent;

import org.w3c.dom.css.Counter;

public class ArithmeticSeries {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		int counter = 1;
		int sumK = 0;

		while (counter <= n) {
			sumK += counter;
			counter++;
		}
		System.out.printf("%d%n", sumK);
	}
}

//int n = Integer.parseInt(args[0]);
//int i = 0;
//int total = 0;
//while (i < n) {
//    i += 1;
//    total += i;
//}
//System.out.println(total);
//}
//
//}