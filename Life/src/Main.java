import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		String[] locations = { "America", "Europe", "Oceania", "Asia", "Africa" };
		String[] sexes = { "male", "female" };
		String[] americanMaleNames = { "insertamericanmalenamehere" };
		String[] americanFemaleNames = { "insertamericanfemalenamehere" };
		String[] europeanMaleNames = { "inserteuropeanmalenamehere" };
		String[] europeanFemaleNames = { "inserteuropeafemalenamehere" };
		String[] africanMaleNames = { "insertafricanmalenamehere" };
		String[] africanFemaleNames = { "insertafricanfemalenamehere" };
		String[] asianMaleNames = { "insertasianmalenamehere" };
		String[] asianFemaleNames = { "insertasianfemalenamehere" };
		String[] oceanianMaleNames = { "insertoceanianmalenamehere" };
		String[] oceanianFemaleNames = { "insertoceanianfemalenamehere" };
		String[] americanAnimals = { "rat", "fly", "bald eagle" };
		String[] europeanAnimals = { "rat", "fly", "hedgehog" };
		String[] africanAnimals = { "rat", "fly", "lion" };
		String[] asianAnimals = { "rat", "fly", "panda" };
		String[] oceanianAnimals = { "rat", "fly", "kangaroo" };
		boolean human = r.nextBoolean();
		int a = r.nextInt(locations.length);
		int b = r.nextInt(71) + 1950;
		int c = r.nextInt(sexes.length);
		final String animalName = null;
		if (human == true) {
			if (locations[a] == "America" && sexes[c] == "male") {
				int d = r.nextInt(americanMaleNames.length);
				Entity e = new Entity("human", americanMaleNames[d], sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "America" && sexes[c] == "female") {
				int d = r.nextInt(americanFemaleNames.length);
				Entity e = new Entity("human", americanFemaleNames[d], sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "Europe" && sexes[c] == "male") {
				int d = r.nextInt(europeanMaleNames.length);
				Entity e = new Entity("human", europeanMaleNames[d], sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "Europe" && sexes[c] == "female") {
				int d = r.nextInt(europeanFemaleNames.length);
				Entity e = new Entity("human", europeanFemaleNames[d], sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "Oceania" && sexes[c] == "male") {
				int d = r.nextInt(oceanianMaleNames.length);
				Entity e = new Entity("human", oceanianMaleNames[d], sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "Oceania" && sexes[c] == "female") {
				int d = r.nextInt(oceanianFemaleNames.length);
				Entity e = new Entity("human", oceanianFemaleNames[d], sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "Asia" && sexes[c] == "male") {
				int d = r.nextInt(asianMaleNames.length);
				Entity e = new Entity("human", asianMaleNames[d], sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "Asia" && sexes[c] == "female") {
				int d = r.nextInt(asianFemaleNames.length);
				Entity e = new Entity("human", asianFemaleNames[d], sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "Africa" && sexes[c] == "male") {
				int d = r.nextInt(africanMaleNames.length);
				Entity e = new Entity("human", africanMaleNames[d], sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "America" && sexes[c] == "female") {
				int d = r.nextInt(africanFemaleNames.length);
				Entity e = new Entity("human", africanFemaleNames[d], sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
		} else {
			if (locations[a] == "America") {
				int f = r.nextInt(americanAnimals.length);
				Entity e = new Entity(americanAnimals[f], animalName, sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "Europe") {
				int f = r.nextInt(europeanAnimals.length);
				Entity e = new Entity(europeanAnimals[f], animalName, sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "Africa") {
				int f = r.nextInt(africanAnimals.length);
				Entity e = new Entity(africanAnimals[f], animalName, sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "Asia") {
				int f = r.nextInt(asianAnimals.length);
				Entity e = new Entity(asianAnimals[f], animalName, sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
			if (locations[a] == "Oceania") {
				int f = r.nextInt(oceanianAnimals.length);
				Entity e = new Entity(oceanianAnimals[f], animalName, sexes[c], locations[a], b);
				System.out.println(e);
				e.play();
			}
		}

	}

}
