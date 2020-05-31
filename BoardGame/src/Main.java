import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Welcome to the board game!\n");
		System.out.println("Reach position 100 on the board before the other player(s) to win!\n");
		System.out.println("how many players will be playing? :");
		int players = s.nextInt();
		Dice[] dices = new Dice[players];
		int[] a = new int[players];
		int[] position = new int[players];
		int c = position[0];
		if (players < 2) {
			System.err.println("there must be at least 2 players");
		} else {
			while (c != 100) {
				for (int i = 1; i <= players; i++) {
					a[i - 1] = r.nextInt(6) + 1;
					dices[i - 1] = new Dice(a[i - 1]);
					position[i - 1] = 0;
					System.out.println("Player " + i + " press enter to roll");
					s.nextLine();
					System.out.print("player " + i + " ");
					dices[i - 1].Roll();
					c = position[i - 1] + dices[i - 1].getDiceValue();
					System.out.println(
							"player " + i + " went from position " + position[i - 1] + " to position " + c + "\n");
				}
			}
		}

	}

}
