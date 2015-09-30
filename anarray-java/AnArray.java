import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnArray {

	public int solveProblem(int[] A, int K) {
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

		ArrayList<Integer> f = new ArrayList<Integer>();
		for (int i = 1; i <= Math.sqrt(K); i++) {
			if (K % i == 0) {
				f.add(i);
				if (i != Math.sqrt(K)) {
					f.add(K / i);
				}
			}
		}

		//nice logic :DDDDDD
		int ans = 0;
		for (int i = 2; i < A.length; i++) {
			for (int j = i - 2; j >= 0; j--) {
				int firstGCD = gcd(A[i - 1], K);
				int key = firstGCD * gcd(A[j], K / firstGCD);
				if (count.get(key) == null) {
					count.put(key, 1);
				} else {
					count.put(key, 1 + count.get(key));
				}
			}

			int gcd = gcd(K, A[i]);
			int n = K / gcd;
			for (int k = 0; k < f.size(); k++) {
				if (f.get(k) % n == 0 && count.get(f.get(k)) != null) {
					ans += count.get(f.get(k));
				}
			}
		}
		System.out.println(ans);
		return ans;
	}

	private int gcd(int a, int b) {
		if (a == 0) {
			return b;
		} else {
			return gcd(b % a, a);
		}
	}

	public static void main(String[] args) {
		int[] A = new int[] { 1, 1, 1, 1, 1 };
		int K = 1;
		new AnArray().solveProblem(A, K);
	}

}
