import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class CollectingTokens {
	ArrayList<Integer>[] tree = (ArrayList<Integer>[]) new ArrayList[51];
	int tokens[];

	public int maxTokens(int[] A, int[] B, int[] tokens, int L) {
		for (int i = 0; i < tree.length; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < A.length; i++) {
			tree[A[i]].add(B[i]);
			tree[B[i]].add(A[i]);
		}
		this.tokens = tokens;
		return calc(0, L) + this.tokens[0];
	}

	private int calc(int start, int L) {
		for (int i = 0; i <= L; i += 2) {

		}
		int max = 0;
		for (int i = 0; i < tokens.length; i++) {
			if (X[start][i]) {
				int currTokens = tokens[start];
				tokens[start] = 0;
				max = Math.max(max, currTokens + calc(i, L - 1));
				tokens[start] = currTokens;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 25, 22, 35, 42, 40, 9, 32, 12, 37, 44, 23, 1, 24, 28, 20, 4, 26, 33, 11, 48, 34, 6, 16,
				50, 46, 17, 8, 43, 18, 30, 31, 36, 39, 13, 10, 45, 3, 47, 15, 2, 29, 19, 7, 14, 41, 49, 38, 27, 21 };
		int[] B = new int[] { 5, 5, 25, 25, 25, 42, 25, 40, 5, 35, 25, 32, 42, 9, 32, 23, 40, 25, 20, 33, 26, 37, 12, 1,
				48, 24, 22, 25, 11, 24, 48, 34, 18, 9, 50, 42, 16, 40, 1, 10, 47, 22, 48, 44, 48, 1, 4, 46, 47 };
		int[] tokens = new int[] { 6, 9, 4, 9, 5, 8, 6, 4, 4, 1, 4, 8, 3, 4, 5, 8, 5, 6, 4, 9, 7, 9, 7, 9, 5, 2, 7, 2,
				7, 7, 5, 9, 5, 8, 5, 7, 1, 9, 3, 9, 3, 6, 4, 5, 5, 4, 7, 9, 2, 2 };
		int L = 48;

		int expected = 194;
		System.out.println(new CollectingTokensBakup().maxTokens(A, B, tokens, L));
	}

}
