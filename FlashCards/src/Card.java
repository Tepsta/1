
public class Card {
	static String front;
	static String back;

	public static String getBack() {
		return back;
	}

	public static String getFront() {
		return front;
	}

	Card(String front, String back) {
		Card.front = front;
		Card.back = back;
	}
}
