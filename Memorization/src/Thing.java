
public class Thing {
	String name;
	int value;

	public Thing(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Thing [name=" + name + ", value=" + value + "]";
	}

}
