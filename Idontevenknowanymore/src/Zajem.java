
public class Zajem {
	int value;
	String personName;

	public Zajem(String personName, int value) {
		this.personName = personName;
		this.value = value;
	}

	public void kolikZajmu() {
		System.out.println("zajem level = " + value);
		if (value > -1 && value < 26) {
			System.out.println(personName + " ma velky zajem");
		}
		if (value > 25 && value < 51) {
			System.out.println(personName + " ma zajem");
		}
		if (value > 50 && value < 76) {
			System.out.println(personName + " ma malo zajem");
		}
		if (value > 75 && value < 101) {
			System.out.println(personName + " nema zajem");
		}
		if (value < -1 || value > 100) {
			System.err.println("INVALID ZAJEM");
		}
	}
}
