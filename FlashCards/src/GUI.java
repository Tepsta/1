import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	private int count = 0;
	private JFrame frame;
	private JButton button;
	private JLabel label;
	private JPanel panel;

	public GUI(Card c) {
		frame = new JFrame();
		button = new JButton("See translation");
		label = new JLabel(c.front);
		panel = new JPanel();
		button.addActionListener(this);
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Flash Cards");
		frame.pack();
		frame.setSize(300, 400);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		count++;
		if (count % 2 == 0) {
			label.setText(Card.getFront());
		} else {
			label.setText(Card.getBack());
		}
	}
}
