
public class Main {
	public static String encrypt(String message, int[] key, int K) {
		char[] eMessage;
		for (int j = 0; j < K; j++) {
			eMessage = new char[message.length()];
			for (int i = 0; i < message.length(); i++) {
				eMessage[key[i]] = message.charAt(i);
			}
			message = new String(eMessage);
		}
		return message;
	}

	public static void main(String[] args) {
		int key[] = {4, 3, 6, 2, 5, 1, 0, 7};
		System.out.println(encrypt("uogcodlk", key, 1));
	}
}
