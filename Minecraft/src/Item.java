
public class Item {
	String itemName;
	Block place;

	public Item(String itemName) {

		this.itemName = itemName;

	}

	public void place() {

		System.err.println("can't place " + itemName);

	}

	@Override
	public String toString() {

		return itemName;

	}
}
