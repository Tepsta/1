
public class AString {
	String a;

	public String getString() {
		return a;
	}

	public AString(String a) {
		this.a = a;
	}

	public static String reverse(String b) {
		if (b == null) {
			return null;
		}
		int stringLength = b.length();
		StringBuilder sb = new StringBuilder();
		for (int i = stringLength - 1; i >= 0; i--) {
			sb.append(b.charAt(i));
		}
		return sb.toString();
	}

	public static String merge(String b, String c) {
		int stringLength = b.length();
		int stringLength2 = c.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < stringLength || i < stringLength2; i++) {
			if (i < stringLength2) {
				sb.append(c.charAt(i));
			}
			if (i < stringLength) {
				sb.append(b.charAt(i));
			}
		}
		return sb.toString();
	}

	public static String merge2(String b, String c) {
		int stringLength = b.length();
		int stringLength2 = c.length();
		StringBuilder sb = new StringBuilder();
		if (stringLength > stringLength2) {
			sb.insert(stringLength, b);
		} else {
			sb.insert(stringLength2, c);
		}
		return sb.toString();
	}
}
