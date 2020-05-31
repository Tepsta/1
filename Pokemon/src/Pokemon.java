
public class Pokemon {
	String name;
	double level;
	double baseHP;
	double baseAttack;
	double baseSpeed;

	public Pokemon(String name, double level, double baseHP, double baseAttack, double baseSpeed) {
		this.name = name;
		this.level = level;
		this.baseHP = baseHP;
		this.baseAttack = baseAttack;
		this.baseSpeed = baseSpeed;
	}

	public void Battle(Pokemon p1, Pokemon p2) {

	}

	public double getHp() {
		return baseHP + level * ((1 / 50) * baseHP);
	}

	public double getAttack() {
		return baseAttack + level * ((1 / 50) * baseAttack);
	}

	public double getSpeed() {
		return baseSpeed + level * ((1 / 50) * baseSpeed);
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", level=" + level + ", hp=" + getHp() + ", attack=" + getAttack() + ", speed=" + getSpeed()
				+ "]";
	}
}
