
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AString as1 = new AString("xd123");
		AString as2 = new AString("OMEGALUL");
		AString as3 = new AString("STRING");
		String a = "lol";
		String b = "notcool";
		String c = "idk";
		String d = "abcdefgh";
		System.out.println(AString.reverse(as1.getString()));
		System.out.println(AString.merge(as1.getString(), as2.getString()));
		System.out.println(AString.merge2(as2.getString(), as3.getString()));
		System.out.println(AString.reverse(a));
		System.out.println(AString.merge(a, b));
		System.out.println(AString.merge2(c, d));
	}
}