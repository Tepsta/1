import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HMGame {
	public static final String[] words = { "PROGRAM", "HUMAN", "EXAMPLE", "INFORMATION" };
	public static final Random r = new Random();
	public static final int deathAttempt = 8;
	private String word;
	private char[] wordFound;
	private int errors;
	private ArrayList<String> letters = new ArrayList<String>();

	private String chooseWord() {
		return words[r.nextInt(words.length)];
	}

	public void gameStart() {
		errors = 0;
		letters.clear();
		word = chooseWord();
		wordFound = new char[word.length()];
		for (int i = 0; i < wordFound.length; i++) {
			wordFound[i] = '_';
		}
	}

	public boolean correct() {
		return word.contentEquals(new String(wordFound));
	}

	public void enter(String s) {
		if (!letters.contains(s)) {
			if (word.contains(s)) {
				int a = word.indexOf(s);
				while (a >= 0) {
					wordFound[a] = s.charAt(0);
					a = word.indexOf(s, a + 1);
				}
			} else {
				errors++;
			}
			letters.add(s);
		}
	}

	public String stateOfWord() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < wordFound.length; i++) {
			sb.append(wordFound[i]);
			if (i < wordFound.length - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	public void play() {
		try (Scanner s = new Scanner(System.in)) {
			while (errors < deathAttempt) {
				System.out.println("Enter a letter to  guess the word: ");
				String b = s.nextLine();
				if (b.length() > 1) {
					b = b.substring(0, 1);
				}
				enter(b);
				System.out.println(stateOfWord());
				if (correct()) {
					System.out.println("Congratulations! You win!");
					break;
				} else {
					System.out.println("Attempts remaining :" + (deathAttempt - errors));
				}
			}
			if (deathAttempt == errors) {
				System.err.println("You lose!");
				System.err.println("The word was " + word);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Hangman!");
		HMGame hmg = new HMGame();
		hmg.play();
	}
}
