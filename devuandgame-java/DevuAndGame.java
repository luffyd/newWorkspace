public class DevuAndGame {

	public String canWin(int[] nextLevel) {
		boolean visited[] = new boolean[nextLevel.length];
		int start = 0;
		while (start != -1 && !visited[start]) {
			visited[start] = true;
			start = nextLevel[start];
		}
		if (start == -1) {
			return "Win";
		} else {
			return "Lose";
		}
	}

}
