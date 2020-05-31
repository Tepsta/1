import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int answer1;
		int answer2;
		int answer3;
		int answer4;
		int k = 1;
		while (k == 1) {
			System.out.println("Adding 2 numbers.\n");
			System.out.println("Enter 1st number: ");
			a = s.nextInt();
			System.out.println("Enter 2nd number:");
			b = s.nextInt();
			answer1 = a + b;
			System.out.println(a + "+" + b + "=" + answer1);
			System.out.println("\nMultiplying 2 numbers.\n");
			System.out.println("Enter 1st number: ");
			c = s.nextInt();
			System.out.println("Enter 2nd number:");
			d = s.nextInt();
			answer2 = c * d;
			System.out.println(c + "*" + d + "=" + answer2);
			System.out.println("\nDividing 2 numbers.\n");
			System.out.println("Enter 1st number: ");
			e = s.nextInt();
			System.out.println("Enter 2nd number:");
			f = s.nextInt();
			answer3 = e / f;
			System.out.println(e + "/" + f + "=" + answer3);
			System.out.println("\nSubtracting 2 numbers.\n");
			System.out.println("Enter 1st number: ");
			g = s.nextInt();
			System.out.println("Enter 2nd number:");
			h = s.nextInt();
			answer4 = g - h;
			System.out.println(g + "-" + h + "=" + answer4);
			System.out.println("\nDo you want to do it again?\n");
			System.out.println("Enter 1 if yes\n");
			System.out.println("Enter 0 if no");
			k = s.nextInt();
		}
		System.out.println("END");
	}

}
