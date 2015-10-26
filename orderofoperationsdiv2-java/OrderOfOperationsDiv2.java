import java.util.Arrays;

public class OrderOfOperationsDiv2 {

	public int minTime(String[] s) {
		int m[] = new int[s.length];
		int finalCache = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) == '1') {
					m[i] |= 1 << j;
				}
			}
			finalCache |= m[i];
		}
		// a||b -
		int costOfCache[] = new int[1 << s[0].length() + 1];
		Arrays.fill(costOfCache, Integer.MAX_VALUE);
		costOfCache[0] = 0;
		for (int start = 0; start < finalCache; start++) {
			if (costOfCache[start] != Integer.MAX_VALUE) {
				for (int i = 0; i < m.length; i++) {
					int x = (start | m[i]) ^ start;
					int extraCost = 0;
					while (x > 0) {
						extraCost += x & 1;
						x = x / 2;
					}
					costOfCache[start | m[i]] = (int) Math.min(costOfCache[start] + Math.pow(extraCost, 2),
							costOfCache[start | m[i]]);
				}
			}
		}
		return costOfCache[finalCache];
	}

	public static void main(String[] args) {
		String[] s = new String[] { "11101", "00111", "10101", "00000", "11000" };
		System.out.println(new OrderOfOperationsDiv2().minTime(s));

	}
}
