import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean again = true;
		String[] spole = new String[999];
		thing: while (again = true) {
			System.out.println("Enter a string to count its vowels: ");
			for (int i = 0; i < spole.length; i++) {
				spole[i] = s.nextLine();
				Vowels(spole[i]);
				System.out.println("Do you want to enter another string?");
				System.out.println("Type 1 if yes or 0 if no");
				int b = s.nextInt();
				if (b == 0) {
					break thing;
				}
				if (b != 1 && b != 0) {
					System.err.println("You did not enter a valid number");
				}
			}
		}
		System.out.println("END");
	}

	private static void Vowels(String a) {
		// TODO Auto-generated method stub
		int aAmount = 0;
		int eAmount = 0;
		int iAmount = 0;
		int oAmount = 0;
		int uAmount = 0;
		for (int i = 0; i < a.length(); i++) {
			if (ACheck(a.charAt(i))) {
				aAmount++;
			}
			if (ECheck(a.charAt(i))) {
				eAmount++;
			}
			if (ICheck(a.charAt(i))) {
				iAmount++;
			}
			if (OCheck(a.charAt(i))) {
				oAmount++;
			}
			if (UCheck(a.charAt(i))) {
				uAmount++;
			}
		}
		int vowelAmount = aAmount + oAmount + iAmount + eAmount + uAmount;
		System.out.println("The string has " + vowelAmount + " vowels");
		System.out.println(aAmount + " A's");
		System.out.println(eAmount + " E's");
		System.out.println(iAmount + " I's");
		System.out.println(oAmount + " O's");
		System.out.println(uAmount + " U's");
	}

	private static boolean ACheck(char a) {
		a = Character.toUpperCase(a);
		return (a == 'A');
	}

	private static boolean ECheck(char a) {
		a = Character.toUpperCase(a);
		return (a == 'E');
	}

	private static boolean ICheck(char a) {
		a = Character.toUpperCase(a);
		return (a == 'I');
	}

	private static boolean OCheck(char a) {
		a = Character.toUpperCase(a);
		return (a == 'O');
	}

	private static boolean UCheck(char a) {
		a = Character.toUpperCase(a);
		return (a == 'U');
	}

}
