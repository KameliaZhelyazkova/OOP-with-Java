import java.awt.Color;

public class Voronoi {
	public static double pointDist(Point2D point1, Point2D point2) {
		double dX = point1.getX() - point2.getX();
		double dY = point1.getY() - point2.getY();
		return Math.sqrt(dX * dX + dY * dY);
	}

	public static int findClosestPoint(Point2D point, Point2D[] sites) {
		int closestPoint = 0;
		double closestDistance = pointDist(point, sites[0]);
		for (int i = 0; i < sites.length; i++) {
			double distance = pointDist(point, sites[i]);
			if (distance < closestDistance) {
				closestDistance = distance;
				closestPoint = i;
			}
		}
		return closestPoint;
	}

	public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {
		int[][] voronoiMap = new int[width][height];

		for (int i = 0; i < voronoiMap.length; i++) {
			for (int j = 0; j < voronoiMap[0].length; j++) {
				voronoiMap[i][j] = findClosestPoint(new Point2D(i, j), sites);
			}
		}
		return voronoiMap;
	}

	public static void polotVoronoiMap(Point2D[] sites, Color[] colors,
			int[][] voronoiMap) {
		// Use StdDraw.setPenColor() to pick the color of the pixel, and
		// StdDraw.point(i, j) to draw a pixel at coordinates (i, j). Once you
		// have plotted all the points, set the pen color to Color.BLACK and use
		// StdDraw.filledCircle() with size around 3 to plot each of the sites.
		int width = voronoiMap.length;
		int height = voronoiMap[0].length;

		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);

		for (int i = 0; i < voronoiMap.length; i++) {
			for (int j = 0; j < voronoiMap[0].length; j++) {
				StdDraw.setPenColor(colors[voronoiMap[i][j]]);
				StdDraw.point(i, j);
			}
		}
		for (int i = 0; i < sites.length; i++) {
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.filledCircle(sites[i].getX(), sites[i].getY(), 3);
		}
		StdDraw.show();
	}

	public static void main(String[] args) {
		int width = 200;
		int height = 200;

		int nSites = 5;
		Point2D[] sites = new Point2D[nSites];
		sites[0] = new Point2D(50, 50);
		sites[1] = new Point2D(100, 50);
		sites[2] = new Point2D(50, 100);
		sites[3] = new Point2D(125, 50);
		sites[4] = new Point2D(100, 175);

		Color[] colors = new Color[nSites];
		colors[0] = Color.BLUE;
		colors[1] = Color.WHITE;
		colors[2] = Color.YELLOW;
		colors[3] = Color.ORANGE;
		colors[4] = Color.MAGENTA;

		int[][] voronoiMap = buildVoronoiMap(sites, width, height);
		polotVoronoiMap(sites, colors, voronoiMap);
	}
}
