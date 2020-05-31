import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		Player p = new Player(100, 30);
		Enemy e1;
		Enemy e2;
		Enemy e3;
		Enemy[] enemies = { e1 = new Enemy(100, 30, "Enemy1"), e2 = new Enemy(50, 15, "Enemy2"),
				e3 = new Enemy(5, 1, "Enemy3") };
		System.out.println("Welcome!\n");
		boolean progressing = true;
		while (progressing == true) {
			Enemy e = enemies[r.nextInt(enemies.length)];
			int enemyHP = r.nextInt(e.getMaxHP());
			System.out.println(e + "appeared!\n");
			while (enemyHP > 0) {
				System.out.println("Player HP:" + p.getHp());
				System.out.println(e + " HP:" + enemyHP);
			}
		}
	}

}
