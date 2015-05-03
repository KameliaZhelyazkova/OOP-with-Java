public class Interval {

	private double left;
	private double right;

	public Interval(double left, double right) {
		this.left = left;
		this.right = right;
	}

	public boolean doesContain(double x) {

		if (left < x && x < right) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (this.left > this.right) {
			return true;
		} else {
			return false;
		}
	}

	public boolean intersects(Interval b) {

		if (!this.isEmpty()) {
			if (this.left > b.right 
					||  this.right < b.left) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		if (this.isEmpty() == false) {
			return "Interval: [" + this.left + ", " + this.right + "]";
		} else {
			return "Interval: (EMPTY)";
		}
	}
}
