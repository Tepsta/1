
public class Block {
	String blockName;
	double durability;
	PlacableItem drop;

	public Block(String blockName, double durability, PlacableItem drop) {
		this.blockName = blockName;
		this.durability = durability;
		this.drop = drop;
	}

	public PlacableItem getDrop() {
		return drop;
	}

	public void destroy() {
		if (drop == null) {
			System.out.println("no item dropped");
		} else {
			System.out.println(blockName + " dropped " + drop);
		}
	}

	@Override
	public String toString() {
		return blockName;
	}

}
