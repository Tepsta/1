
public class Dice {
	int diceValue;

	public Dice(int diceValue) {
		this.diceValue = diceValue;
	}

	public void Roll() {
		System.out.println("rolled a: " + diceValue + "\n");
	}
	public int getDiceValue() {
		return diceValue;
	}
}
