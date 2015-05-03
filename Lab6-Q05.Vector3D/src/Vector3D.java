public class Vector3D {

	private double x;
	private double y;
	private double z;

	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getR() {
		// return Math.sqrt(x*x + y*y + z*z);
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
	}

	public double getTheta() {
		return Math.acos(this.z / getR());
	}

	public double getPhi() {
		return Math.atan2(this.y, this.x);
	}

	public static Vector3D add(Vector3D lhs, Vector3D rhs) {
		Vector3D sumResultVetor = new Vector3D(lhs.x + rhs.x, lhs.y + rhs.y,
				lhs.z + rhs.z);
		return sumResultVetor;
	}

	public static Vector3D subtract(Vector3D lhs, Vector3D rhs) {
		Vector3D differenceResultVector = new Vector3D(lhs.x - rhs.x, lhs.y - rhs.y, lhs.z - rhs.z);
		return differenceResultVector;
	}
	public static Vector3D scale(Vector3D v, double scaleFactor){
		Vector3D scaledVector = new Vector3D(v.x*scaleFactor, v.y*scaleFactor, v.z*scaleFactor);
		return scaledVector;
	}
	public static void main(String[] args) {
		Vector3D firstSampleVector = new Vector3D(1, 2, 3);
		Vector3D secondSampleVector = new Vector3D(4, 5, 6);
		System.out.println(firstSampleVector.getTheta() + "\n" + secondSampleVector.getTheta());
		System.out.println(Vector3D.add(firstSampleVector, secondSampleVector));
	}
	

}
