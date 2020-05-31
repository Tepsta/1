
public class PlacableItem {
	String placableItemName;
	Block place;

	public PlacableItem(String placableItemName, Block place) {

		this.placableItemName = placableItemName;
		this.place = place;

	}

	public void place() {

		System.out.println(placableItemName + " placed a " + place);

	}

	@Override
	public String toString() {

		return placableItemName;

	}
}
