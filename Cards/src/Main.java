import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		try {
			Card bird = new Card("鳥", ImageIO.read(new File("bird.png")));
			Card cat = new Card("猫", ImageIO.read(new File("cat.png")));
			System.out.println(bird);
			System.out.println(cat);
			JFrame frame = new JFrame("Card");
			frame.setSize(400, 600);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			JPanel panel = new JPanel(new BorderLayout());
			JLabel label = new JLabel(new ImageIcon(bird.getImage()));
			label.setSize(300, 400);
			panel.add(label);
			frame.add(panel);
			JFrame frame2 = new JFrame("Card");
			frame2.setSize(400, 600);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.setVisible(true);
			JPanel panel2 = new JPanel(new BorderLayout());
			JLabel label2 = new JLabel(new ImageIcon(cat.getImage()));
			label2.setSize(300, 400);
			panel2.add(label2);
			frame2.add(panel2);
			// JButton button = new JButton("See translation");
			// panel.add(button);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
