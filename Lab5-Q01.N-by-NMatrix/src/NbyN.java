public class NbyN {

	public static int[][] nbyn(int N) {
		int[][] matrix = new int[N][N];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					matrix[i][j] = i; // when this condition is valid, the value
										// behind matrix[i][j] is equal to i
										// (the index of the row)
				} else {
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;
	}

//	public static void main(String[] args) {
//		int[][] matrix = nbyn(10);
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				System.out.printf("%d ", matrix[i][j]);
//			}
//			System.out.println();
//		}
//	}
//}
    public static void main(String[] args) {
        int[][] matrix = nbyn(10);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}