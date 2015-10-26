public class PaintTheRoom {

	public String canPaintEvenly(int R, int C, int K) {
		if (K == 1 || R % 2 == 0 || C % 2 == 0) {
			return "Paint";
		} else {
			return "Cannot paint";
		}
	}

}
