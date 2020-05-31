
public class Card {
	String name;
	boolean hidden = true;
	int value;

	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public void flip1() {
		this.setName(this.name);
		this.hidden = false;
	}

	public void flip2() {
		this.hidden = true;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		if (hidden == false) {
			return " " + name + " " + value;
		} else {
			return " hidden " + value;
		}

	}
}
