
public abstract class DevilFruit {
	String name;
	String type;
	String ability;

	public DevilFruit(String name, String type, String ability) {
		super();
		this.name = name;
		this.type = type;
		this.ability = ability;
	}

	@Override
	public String toString() {
		return "The " + name + " is a " + type + " devil fruit that " + ability;
	}

	public String getName() {
		return name;
	}

}
