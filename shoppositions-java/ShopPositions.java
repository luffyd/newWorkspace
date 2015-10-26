import java.util.Arrays;

public class ShopPositions {
	int m = 0;
	int n = 0;
	int[] cost;
	int dp[][][] = new int[31][31][31];

	public int maxProfit(int n, int m, int[] c) {
		int maxProfit = 0;
		this.cost = c;
		this.m = m;
		this.n = n;
		for (int i = 0; i < 31; i++) {
			for (int j = 0; j < 31; j++) {
				Arrays.fill(dp[i][j], -1);
			}
		}
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= m; j++) {
				int p = i * profitOf(0, i, j, 0);
				maxProfit = Math.max(maxProfit, p + calc(i, j, 2));
			}
		}
		return maxProfit;
	}

	private int calc(int a, int b, int building) {
		if (dp[a][b][building] != -1) {
			return dp[a][b][building];
		}
		int maxProfit = 0;
		if (building >= n) {
			maxProfit = b * profitOf(building - 1, a, b, 0);
		} else {
			for (int i = 0; i <= m; i++) {
				int p = b * profitOf(building - 1, a, b, i);
				maxProfit = Math.max(maxProfit, p + calc(b, i, building + 1));
			}
		}
		dp[a][b][building] = maxProfit;
		return maxProfit;
	}

	private int profitOf(int n, int a, int b, int c) {
		if (3 * n * m + (a + b + c) - 1 < 0 || 3 * n * m + (a + b + c) - 1 >= cost.length) {
			return 0;
		}
		return cost[3 * n * m + (a + b + c) - 1];
	}

	public static void main(String[] args) {
		int n = 3;
		int m = 1;
		int[] c = new int[] { 7, 6, 1, 10, 4, 1, 7, 6, 3 };
		System.out.println(new ShopPositions().maxProfit(n, m, c));
	}
}
