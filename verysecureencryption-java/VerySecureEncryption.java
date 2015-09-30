public class VerySecureEncryption {

	public String encrypt(String message, int[] key, int K) {
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

}
