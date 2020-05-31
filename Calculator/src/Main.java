import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double a;
		double b;
		double answer;
		System.out.println("2 number calculator\n");
		System.out.println("Enter your first number:");
		a = s.nextDouble();
		System.out.println("Enter your second number:");
		b = s.nextDouble();
		System.out.println("Chose your operator (+, -, *, /)");
		char o = s.next().charAt(0);
		s.close();
		switch (o) {
		case '+':
			answer = a + b;
			break;
		case '-':
			answer = a - b;
			break;
		case '*':
			answer = a * b;
			break;
		case '/':
			answer = a / b;
			break;
		default:
			System.err.println("Invalid operator");
			return;
		}
		System.out.println(a + " " + o + " " + b + " = " + answer);
	}

}
