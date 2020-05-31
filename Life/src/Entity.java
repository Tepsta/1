
public class Entity {

	String location;
	String name;
	String sex;
	String species;
	int year;
	int age = 0;

	public Entity(String species, String name, String sex, String location, int year) {
		this.name = name;
		this.location = location;
		this.year = year;
		this.species = species;
	}

	public void play() {
		if (species == "human") {
			double lifeSpan = 70;
			System.out.println("The average lifespan of a " + species + " is " + lifeSpan + " years");
		}
		if (species == "rat") {
			double lifeSpan = 2.5;
			System.out.println("The average lifespan of a " + species + " is " + lifeSpan + " years");
		}
		if (species == "fly") {
			double lifeSpan = 0.1;
			System.out.println("The average lifespan of a " + species + " is " + lifeSpan + " years");
		}
		if (species == "bald eagle") {
			double lifeSpan = 25;
			System.out.println("The average lifespan of a " + species + " is " + lifeSpan + " years");
		}
		if (species == "hedgehog") {
			double lifeSpan = 5;
			System.out.println("The average lifespan of a " + species + " is " + lifeSpan + " years");
		}
		if (species == "lion") {
			double lifeSpan = 13;
			System.out.println("The average lifespan of a " + species + " is " + lifeSpan + " years");
		}
		if (species == "panda") {
			double lifeSpan = 17.5;
			System.out.println("The average lifespan of a " + species + " is " + lifeSpan + " years");
		}
		if (species == "kangaroo") {
			double lifeSpan = 6;
			System.out.println("The average lifespan of a " + species + " is " + lifeSpan + " years");
		}
		System.out.println("The goal of this game is to live longer than your average lifespan");
		System.out.println("Good luck!");
	}

	@Override
	public String toString() {
		if (name != null) {
			return "It is the year " + year + " in " + location + "\n" + name + " (you) are born as a " + species;
		} else {
			return "It is the year " + year + " in " + location + "\n" + "you are born as a " + species;
		}
	}
}
