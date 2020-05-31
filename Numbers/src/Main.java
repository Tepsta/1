import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("What positive number do you want to find?");
		int targetNumber = s.nextInt();
		if (targetNumber < 0) {
			System.err.println("Your target number must be positive\n");
			System.out.println("What number do you want to find?");
			targetNumber = s.nextInt();
		}
		System.out.println("What is the maximum possible number that can be generated? (shouldn't be bigger than 10000)");
		int max = s.nextInt();
		if (max < targetNumber) {
			System.err.println("The maximum possible number can not be smaller than your target number");
			System.out.println("What is the maximum possible number that can be generated? (shouldn't be bigger than 10000)");
			max = s.nextInt();
		}
		int[] number = new int[10000];
		for (int i = 0; i == i - 0; i++) {
			number[i] = r.nextInt(max + 1);
			if (number[i] != targetNumber) {
				int b = i + 1;
				System.out.println("generation " + b + ": " + number[i]);
			}
			if (number[i] == targetNumber) {
				int b = i + 1;
				System.out.println("generation " + b + ": " + number[i]);
				System.out.println("Your number was found in generation " + b);
				break;
			}
		}
	}

}
