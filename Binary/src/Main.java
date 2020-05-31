import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			boolean again = true;
			Scanner s = new Scanner(System.in);
			while (again == true) {
				System.out.println("Enter 1 for binary to decimal conversion");
				System.out.println("Enter 2 for decimal to binary conversion");
				int a = s.nextInt();
				if (a == 1) {
					System.out.println("Binary to decimal conversion");
					System.out.println("Enter a binary number:");
					String bin = s.nextLine();
					System.out.println("Decimal: " + Integer.parseInt(bin, 2));
				}
				if (a == 2) {
					System.out.println("Decimal to binary conversion");
					System.out.println("Enter a decimal number:");
					int dec = s.nextInt();
					System.out.println("Binary: " + Integer.toBinaryString(dec));
				}
				if (a != 1 && a != 2) {
					System.err.println("Invaled number entered");
				}
				System.out.println("1: Rerun program");
				System.out.println("2: End program");
				int b = s.nextInt();
				if (b == 2) {
					break;
				}
				if (b != 1 && b != 2) {
					System.err.println("Invalid number");
				}
			}
			System.err.println("END");
		} catch (Exception e) {
			System.err.println("?");
		}
	}

}
