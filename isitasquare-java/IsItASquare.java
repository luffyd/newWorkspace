public class IsItASquare {

	public String isSquare(int[] x, int[] y) {
		double l1 = length(x, y, 0, 1);
		double l2 = length(x, y, 0, 2);
		double l3 = length(x, y, 0, 3);
		boolean isSquare = false;
		System.out.println(l1 + "    " + l2 + "     " + l3);
		if (l1 == l2) {
			isSquare = l1 == length(x, y, 1, 3) && l1 == length(x, y, 2, 3) && l3 == length(x, y, 1, 2);
		} else if (l1 == l3) {
			isSquare = l1 == length(x, y, 1, 2) && l1 == length(x, y, 2, 3) && l2 == length(x, y, 1, 3);
		} else if (l2 == l3) {
			isSquare = l2 == length(x, y, 1, 3) && l2 == length(x, y, 2, 1) && l1 == length(x, y, 2, 3);
		}
		if (isSquare) {
			return "It's a square";
		} else {
			return "Not a square";
		}
	}

	public boolean arePerpendicular(int x[], int y[], int a, int b, int c) {
		return (y[b] - y[a]) * (y[c] - y[a]) == -1 * (x[b] - x[a]) * (x[c] - x[a]);
	}

	public double length(int x[], int y[], int a, int b) {
		return Math.pow(x[a] - x[b], 2) + Math.pow(y[a] - y[b], 2);
	}

}
