import java.util.Random;
import java.util.Scanner;

public class Main {
	public static boolean done = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		Paramecia gomu = new Paramecia("Gomu Gomu no Mi", Paramecia.type,
				"gives the user's body the properties of rubber");
		Logia mera = new Logia("Mera Mera no Mi", Logia.type,
				"allows the user to create, control, and transform into fire at will");
		Zoan zouM = new Zoan("Zou Zou no Mi, Model: Mammoth", Zoan.type,
				"allows the user to transform into a mammoth hybrid and full mammoth at will");
		Paramecia gura = new Paramecia("Gura Gura no Mi", Paramecia.type,
				"allows the user to create vibrations, or \"quakes\"");
		Logia goro = new Logia("Goro Goro no Mi", Logia.type,
				"allows the user to create, control, and transform into electricity at will");
		Paramecia ope = new Paramecia("Ope Ope no Mi", Paramecia.type,
				"allows its user to create a spherical space or \"room\", in which the user has complete control over the placement and orientation of the objects inside");
		Zoan hito = new Zoan("Hito Hito no Mi", Zoan.type,
				"allows its user to transform into a human hybrid or a human at will");
		Logia pika = new Logia("Pika Pika no Mi", Logia.type,
				"allows the user to create, control, and transform into light at will");
		Paramecia bara = new Paramecia("Bara Bara no Mi", Paramecia.type,
				"allows the user to be immune to slashing attacks and to be able to split their own body apart into pieces and control the said pieces however they wish, mostly by levitating them away from the user's main body");
		Zoan ushiG = new Zoan("Ushi Ushi no Mi, Model: Giraffe", Zoan.type,
				"allows its user to transform into a giraffe hybrid and a full giraffe at will");
		Paramecia yomi = new Paramecia("Yomi Yomi no Mi", Paramecia.type,
				"enhances the user's soul to the point where they resurrect after their first death, allowing them to live a second time and to use several other soul-based abilities");
		Logia yami = new Logia("Yami Yami no Mi", Logia.type,
				"allows the user to create, control, and transform into darkness at will");
		Paramecia hana = new Paramecia("Hana Hana no Mi", Paramecia.type,
				"allows the user to replicate and sprout pieces of their body from the surface of any object or living thing");
		Paramecia soru = new Paramecia("Soru Soru no Mi", Paramecia.type,
				"allows the user to freely interact with and manipulate souls");
		Zoan toriP = new Zoan("Tori Tori no Mi, Model: Phoenix", Zoan.type,
				"allows the user to transform into a phoenix hybrid and full phoenix at will");
		DevilFruit[] fruits = new DevilFruit[15];
		fruits[0] = gomu;
		fruits[1] = mera;
		fruits[2] = zouM;
		fruits[3] = gura;
		fruits[4] = goro;
		fruits[5] = ope;
		fruits[6] = hito;
		fruits[7] = pika;
		fruits[8] = bara;
		fruits[9] = ushiG;
		fruits[10] = yomi;
		fruits[11] = yami;
		fruits[12] = hana;
		fruits[13] = soru;
		fruits[14] = toriP;
		System.out.println("Welcome to the random devil fruit generator!");
		System.out.println("There are currently " + fruits.length + " fruits that can be generated");
		System.out.println("Type your name to get your own devil fruit");
		String a = s.nextLine();
		thing: while (done == false) {
			for (int i = 0; i < fruits.length; i++) {
				int b = r.nextInt(fruits.length);
				System.out.println(a + " got the " + fruits[b].getName() + ". " + fruits[b]);
				System.out.println("type 1 to generate again\ntype 0 to exit");
				int c = s.nextInt();
				if (c == 0) {
					break thing;
				}
				if (c != 0 && c != 1) {
					System.err.println("Invalid number");
				}
			}
		}
		System.err.println("END");
	}

}
