import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] thingsToMemorise = { "Apple", "Elephant", "Penguin", "Knife", "Socks", "Chocolate", "Cat", "Money",
				"Saturn", "Zoo" };
		ArrayList<Integer> numbersToMemorise = new ArrayList<>(10);
		Thing[] pairs = new Thing[10];
		System.out.println("Welcome to my memorization game!");
		System.out.println("In this game, every 'thing' is assigned a different number.");
		System.out.println("Your job will be to assign a different number to each thing in this game");
		System.out.println("and when you see the same thing again, remember what number you assigned to it.");
		System.out.println("Ready?");
		for (int i = 0; i < thingsToMemorise.length; i++) {
			System.out.println("Assign a number to this: " + thingsToMemorise[i]);
			numbersToMemorise.add(i, s.nextInt());
			if (numbersToMemorise.contains(numbersToMemorise.get(i)) == true) {
				System.err.println("EACH NUMBER MUST BE DIFFERENT");
			}
			pairs[i] = new Thing(thingsToMemorise[i], numbersToMemorise.get(i));
		}
		System.out.println(pairs);
	}

}
