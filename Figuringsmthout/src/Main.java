import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String c1 = null;
		String c2 = null;
		Card[] board = new Card[8];
		board[0] = new Card("apple", 1);
		board[1] = new Card("carrot", 2);
		board[2] = new Card("orange", 3);
		board[3] = new Card("apple", 4);
		board[4] = new Card("carrot", 5);
		board[5] = new Card("orange", 6);
		board[6] = new Card("plum", 7);
		board[7] = new Card("plum", 8);

		for (int i = 0; i < board.length; i++) {
			System.out.println(board[i]);

		}
		System.out.println("Type the number of the card that you want to reveal");
		int a = s.nextInt();
		if (a == 1) {
			board[0].flip1();
			System.out.println(board[0]);
			board[0].flip2();
			System.out.println(board[0]);
			c1 = board[0].getName();

		}
		if (a == 2) {
			board[1].flip1();
			System.out.println(board[1]);
			board[1].flip2();
			System.out.println(board[1]);
			c1 = board[1].getName();
		}
		if (a == 3) {
			board[2].flip1();
			System.out.println(board[2]);
			board[2].flip2();
			System.out.println(board[2]);
			c1 = board[2].getName();
		}
		if (a == 4) {
			board[3].flip1();
			System.out.println(board[3]);
			board[3].flip2();
			System.out.println(board[3]);
			c1 = board[3].getName();
		}
		if (a == 5) {
			board[4].flip1();
			System.out.println(board[4]);
			board[4].flip2();
			System.out.println(board[4]);
			c1 = board[4].getName();
		}
		if (a == 6) {
			board[5].flip1();
			System.out.println(board[5]);
			board[5].flip2();
			System.out.println(board[5]);
			c1 = board[5].getName();
		}
		if (a == 7) {
			board[6].flip1();
			System.out.println(board[6]);
			board[6].flip2();
			System.out.println(board[6]);
			c1 = board[6].getName();
		}
		if (a == 8) {
			board[7].flip1();
			System.out.println(board[7]);
			board[7].flip2();
			System.out.println(board[7]);
			c1 = board[7].getName();
		}
		System.out.println("Type the number of the card that you want to reveal");
		int b = s.nextInt();
		if (b == 1) {
			board[0].flip1();
			System.out.println(board[0]);
			board[0].flip2();
			System.out.println(board[0]);
			c2 = board[0].getName();
		}
		if (b == 2) {
			board[1].flip1();
			System.out.println(board[1]);
			board[1].flip2();
			System.out.println(board[1]);
			c2 = board[1].getName();
		}
		if (b == 3) {
			board[2].flip1();
			System.out.println(board[2]);
			board[2].flip2();
			System.out.println(board[2]);
			c2 = board[2].getName();
		}
		if (b == 4) {
			board[3].flip1();
			System.out.println(board[3]);
			board[3].flip2();
			System.out.println(board[3]);
			c2 = board[3].getName();
		}
		if (b == 5) {
			board[4].flip1();
			System.out.println(board[4]);
			board[4].flip2();
			System.out.println(board[4]);
			c2 = board[4].getName();
		}
		if (b == 6) {
			board[5].flip1();
			System.out.println(board[5]);
			board[5].flip2();
			System.out.println(board[5]);
			c2 = board[5].getName();
		}
		if (b == 7) {
			board[6].flip1();
			System.out.println(board[6]);
			board[6].flip2();
			System.out.println(board[6]);
			c2 = board[6].getName();
		}
		if (b == 8) {
			board[7].flip1();
			System.out.println(board[7]);
			board[7].flip2();
			System.out.println(board[7]);
			c2 = board[7].getName();
		}
		if (c1 == c2) {
			System.out.println("Match!");
		} else {
			System.out.println("No match, you loose!");
		}
	}

}
