
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block dirtBlock = null;
		Block oakLogBlock = null;
		Item[] Inventory = new Item[9];
		Item diamond = new Item("diamond");
		// Block diamondOreBlock = new Block("diamond ore", 50, diamond);
		PlacableItem dirt = new PlacableItem("dirt", dirtBlock);
		PlacableItem oakLog = new PlacableItem("oak log", oakLogBlock);
		dirtBlock = new Block("dirt", 5, dirt);
		Block grassBlock = new Block("grass block", 5, dirt);
		oakLogBlock = new Block("oak log", 10, oakLog);
		Inventory[0] = diamond;
		// diamondOreBlock.destroy();
		dirtBlock.destroy();
		grassBlock.destroy();
		oakLogBlock.destroy();
		diamond.place();
		dirt.place();
		oakLog.place();
		System.out.println("your inventory: " + Inventory[0] + " " + Inventory[1] + " " + Inventory[2] + " "
				+ Inventory[3] + " " + Inventory[4] + " " + Inventory[5] + " " + Inventory[6] + " " + Inventory[7] + " "
				+ Inventory[8]);

	}

}
