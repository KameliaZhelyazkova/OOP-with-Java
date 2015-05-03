public class Rectangle {

	private Point2DDouble topLeft;
	private Point2DDouble bottomRight;

	public Rectangle(Point2DDouble topLeft, Point2DDouble bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}

	public Rectangle() {
		this.topLeft = new Point2DDouble(0, 0);
		this.bottomRight = new Point2DDouble(1, 1);
	}

	public boolean isPointInside(Point2DDouble pt) {

		if (pt.getX() < this.topLeft.getX()) {
			return false;
		}
		if (pt.getX() > this.bottomRight.getX()) {
			return false;
		}
		if (pt.getY() < this.topLeft.getY()) {
			return false;
		}
		if (pt.getY() > bottomRight.getY()) {
			return false;
		} else {
			return true;
		}
	}

}
