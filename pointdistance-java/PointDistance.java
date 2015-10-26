public class PointDistance {

	public int[] findPoint(int x1, int y1, int x2, int y2) {
		int c[] = new int[2];
		for (int i = -100; i <= 100; i++) {
			for (int j = -100; j <= 100; j++) {
				if (Math.pow(x1 - i, 2) + Math.pow(y1 - j, 2) > Math.pow(x2 - i, 2) + Math.pow(y2 - j, 2)) {
					c[0] = i;
					c[1] = j;
					return c;
				}
			}
		}
		return c;
	}

}
