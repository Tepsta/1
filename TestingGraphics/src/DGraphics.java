import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DGraphics extends Canvas {
	Graphics g;

	public void paint(Graphics g) {
		g.drawString("Hello", 50, 50);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DGraphics m = new DGraphics();
		JFrame f = new JFrame();
		f.add(m);
		f.setSize(100, 100);
		f.setVisible(true);
		f.setDefaultCloseOperation();
	}

}
