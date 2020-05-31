
public class Enemy {
	int maxHP;
	int maxDMG;
	String name;

	public Enemy(int maxHP, int maxDMG, String name) {
		this.maxHP = maxHP;
		this.maxDMG = maxDMG;
		this.name = name;
	}

	public int getMaxHP() {
		return maxHP;
	}

	@Override
	public String toString() {
		return name + " [maxHP=" + maxHP + ", maxDMG=" + maxDMG + "]";
	}
}
