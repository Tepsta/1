
public class Player {
	int hp;
	int dmg;

	public Player(int hp, int dmg) {
		this.hp = hp;
		this.dmg = dmg;
	}

	@Override
	public String toString() {
		return "Player [hp=" + hp + ", dmg=" + dmg + "]";
	}

	public int getHp() {
		return hp;
	}

}
