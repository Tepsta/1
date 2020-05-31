import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Word[] questions = { new Word("お金", "money"), new Word("花", "flower"), new Word("靴", "shoes"),
				new Word("部屋", "room"), new Word("新聞", "newspaper") };

		takeTest(questions);

	}

	public static void takeTest(Word[] questions) {
		int score = 0;
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].name);
			String answer = s.nextLine();
			if (answer.equals(questions[i].translation)) {
				score++;
				System.out.println("Correct!");
			} else {
				System.out.println("Wrong! Correct answer is " + questions[i].translation);
			}
		}
		System.out.println("You got " + score + " out of " + questions.length);
	}
}
