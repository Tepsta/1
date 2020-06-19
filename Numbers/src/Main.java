import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("What number do you want to find?");
		int targetNumber = s.nextInt();

		System.out.println("What is the maximum possible number that can be generated? ");
		int max = s.nextInt();

		boolean found = false;

		int gen = 0;
		while (found == false) {
			gen++;
			int temp = (int) (Math.random() * max + 0);
			System.out.println("generation " + gen + ": " + temp);
			if (temp == targetNumber) {

				System.out.println("Your number was found in generation " + gen);
				found = true;
			}

		}
	}

}


