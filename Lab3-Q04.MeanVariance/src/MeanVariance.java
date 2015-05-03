public class MeanVariance {

	public static void main(String[] args) {
		int n = args.length;
		double[] dataSet = new double[n];

		for (int i = 0; i < n; i++) {
			dataSet[i] = Double.parseDouble(args[i]);
		}
		
	//Mean 
		double mean = 0;
		for (int i = 0; i < n; i++) {
			 mean += dataSet[i]/n;
		}
		System.out.println(mean);
		
	//Variance 
		double variance = 0;
		for (int i = 0; i < n; i++){
			variance += (Math.pow((dataSet[i] - mean), 2))/n;
		}
		System.out.println(variance);
	}
}
