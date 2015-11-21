import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XtremeDriving {

	public static long cowX[];
	public static long cowY[];
	public static long precomputed[][] = new long[65][16];

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		InputReader inputReader = new InputReader(System.in);
		long k = inputReader.nextLong();
		int n = inputReader.nextInt();
		cowX = new long[n];
		cowY = new long[n];
		for (int i = 0; i < n; i++) {
			cowX[i] = inputReader.nextLong();
			cowY[i] = inputReader.nextLong();
		}
		preCompute();
		calc(8);
	}

	private static long[] calc(int n) {
		long count[] = new long[16];
		long first[] = null;
		for (long i = 0; i < 64; i++) {
			if ((n & 1 << i) == 1 << i) {
				if (first != null) {
					first = precomputed[(int) i];
				} else {
					populate(count, first, precomputed[(int) i]);
					first = count;
					count = new long[16];
				}
			}
		}
		return count;
	}

	private static void populate(long[] count, long[] first, long[] ls) {

	}

	private static void preCompute() {
		precomputed[0][0] = 1;
		int l = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				precomputed[1][l++] = drive(i, 1, j, 3);
			}
		}
		for (int j = 2; j < 65; j++) {
			l = 0;
			for (int m = 0; m < 4; m++) {
				for (int n = 0; n < 4; n++) {
					for (int i = 0; i < 4; i++) {
						precomputed[j][l] += precomputed[j - 1][(4 * m) + i] * precomputed[j - 1][(4 * n) + i];
						precomputed[j][l] %= Math.pow(10, 9);
					}
					l++;
				}
			}
		}
	}

	/**
	 * Just like that call if range is than 8
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	private static long drive(long x1, long y1, long x2, long y2) {
		if (x1 == x2 && y1 == y2) {
			return 1;
		}
		if (x1 < 1 || x1 > 4 || y1 >= y2) {
			return 0;
		}
		return drive(x1 + 1, y1 + 1, x2, y2) + drive(x1, y1 + 1, x2, y2) + drive(x1 - 1, y1 + 1, x2, y2);
	}
}

class InputReader {
	public BufferedReader reader;

	public StringTokenizer tokenizer;

	public InputReader(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream), 32768);
		tokenizer = null;
	}

	public String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

}