
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon Sableye = new Pokemon("Sableye", 50, 50, 75, 50);
		Pokemon Sableye2 = new Pokemon("Sableye", 1, 50, 75, 50);
		System.out.println(Sableye);
		System.out.println(Sableye2);
		Sableye.Battle(Sableye, Sableye2);
	}

}
