public class GoodString {

	public String isGood(String s) {
		int i = s.indexOf("ab");
		while (i > -1) {
			if (i + 2 < s.length()) {
				s = s.substring(0, i) + s.substring(i + 2);
			} else {
				s = s.substring(0, i);
			}
			i = s.indexOf("ab");
		}
		if (s.length() == 0) {
			return "Good";
		} else {
			return "Bad";
		}
	}

	public static void main(String[] argds) {
		System.out.println(new GoodString().isGood("ab"));
	}

}
