import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("=---=ZAJEMINATOR=---=\n");
		System.out.println("Zadejte jmeno:");
		String name = s.nextLine();
		System.out.println("Kolik mas zajmu? (od 0-100) nebo zadejte -1 pro nahodny zajem");
		int b = s.nextInt();
		int a = r.nextInt(101);
		if (b == -1) {
			Zajem yourZajem = new Zajem(name, a);
			yourZajem.kolikZajmu();
		} else {

			Zajem yourZajem = new Zajem(name, b);
			yourZajem.kolikZajmu();
		}
		// Zajem myZajem = new Zajem(0);
		// Zajem notMyZajem = new Zajem(a);
		// myZajem.kolikZajmu();
		// notMyZajem.kolikZajmu();
	}

}
